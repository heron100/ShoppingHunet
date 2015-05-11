package hunet.shop.product.controller;

import hunet.shop.product.logic.Product;
import hunet.shop.product.logic.ProductService;
import hunet.shop.product.util.FileRenamePolicy;
import hunet.shop.product.util.ProductEntryValidator;
import hunet.shop.product.util.WebConstants;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductEntryValidator productEntryValidator;
	
	/*
	 * 상품 등록 화면 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String toProductEntryView() {
		return "/regist/create";
	}
	
	@ModelAttribute
	public Product setUpForm() {
		Product product = new Product();
		return product;
	}
	
	/*
	 * 상품 등록(DB입력)
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(Product product, BindingResult bindingResult) throws Exception{
		this.productEntryValidator.validate(product, bindingResult);
		
		ModelAndView modelAndView = new ModelAndView("regist/create");
		if(bindingResult.hasErrors()){
			modelAndView.getModel().putAll(bindingResult.getModel());
			return modelAndView;
		}
		
		this.productService.entryProduct(product);
		
		/*
		 * 파일 업로드
		 */
		MultipartFile file = product.getProductImg();
		if(file.getSize() != 0){
			String fileName = file.getOriginalFilename();
			
			//파일명 바꾸기 - 원래 파일명과 업로드파일명을 구한다.
			String uploadFileName = new FileRenamePolicy().rename(fileName, product.getProductId());
			product.setImageUser(fileName);
			product.setImageSystem(uploadFileName);
            
            File newFile = new File(WebConstants.path + uploadFileName);
			file.transferTo(newFile);//특정 파일로 저장
			
			//파일 사이즈 줄이기
			BufferedImage bufimage = ImageIO.read(newFile);
			BufferedImage bISmallImage = Scalr.resize(bufimage, 500);
			
			//확장자 넘겨주기
			int dot = uploadFileName.lastIndexOf(".");
			String ext = uploadFileName.substring(dot+1);
			ImageIO.write(bISmallImage, ext, newFile);
			
			//업로드 파일명 등록
			this.productService.updateImageName(product);
		}

		modelAndView.setViewName("redirect:/product/index.do");
		return modelAndView;
	}

//	@RequestMapping(value = "/item/edit")
//	public ModelAndView edit(Integer itemId){
//		ModelAndView modelAndView = new ModelAndView("item/update");
//		Product product = this.productService.getItemByItemId(itemId);
//		modelAndView.addObject(product);
//		return modelAndView;
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public ModelAndView update(Product product, BindingResult bindingResult){
//		if(bindingResult.hasErrors()){
//			ModelAndView modelAndView = new ModelAndView("item/update");
//			modelAndView.getModel().putAll(bindingResult.getModel());
//			return modelAndView;
//		}
//		this.productService.updateItem(product);
//		return this.index();
//	}
	
//	@RequestMapping(value = "/item/confirm")
//	public ModelAndView confirm(Integer productId){
//		ModelAndView modelAndView = new ModelAndView("item/delete");
//		Product product = this.productService.getProductById(productId);
//		modelAndView.addObject(product);
//		return modelAndView;
//	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public ModelAndView delete(Product product){
//		this.productService.deleteItem(product);
//		return this.index();
//	}
//	
//	@RequestMapping(value = "/item/image")
//	public void image(Integer itemId, HttpServletResponse response){
//		response.setContentType("image/jpeg");
//		InputStream picture = null;
//		OutputStream os = null;
//		BufferedInputStream bis = null;
//		try{
//			picture = this.productService.getPicture(itemId);
//			os = response.getOutputStream();
//			bis = new BufferedInputStream(picture);
//			int data;
//			while((data = bis.read()) != -1){
//				os.write(data);
//			}
//		}catch(IOException e){
//			throw new RuntimeException();
//		}finally{
//			try{
//				if(picture != null){
//					picture.close();
//					os.close();
//					bis.close();
//				}
//			}catch(IOException e){}
//		}
//	}
}
