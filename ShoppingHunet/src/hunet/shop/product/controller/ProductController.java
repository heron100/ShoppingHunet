package hunet.shop.product.controller;

import hunet.shop.product.logic.Product;
import hunet.shop.product.logic.ProductService;
import hunet.shop.product.util.ProductEntryValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductEntryValidator productEntryValidator;
	
	/*
	 * 리스트(관리자)
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
		List<Product> productList = this.productService.getProductList();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("productList", productList);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addAllObjects(model);
		return modelAndView;
	}
	
	/*
	 * 검색(관리자)
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView search(String srchProductName, String srchProductCode) throws Exception{
		System.out.println(srchProductName+"___"+srchProductCode);
		Product product = new Product();
		product.setSrchProductName(srchProductName);
		product.setSrchProductCode(srchProductCode);
		List<Product> productList = this.productService.getProductListBySrchCondition(product);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("productList", productList);
		return mav;
	}

	/*
	 * 상품 상세
	 */
	@RequestMapping(value = "/product/detail")
	public ModelAndView handleRequestInternal(Integer productId, String pageNumber){
		ModelAndView mav = new ModelAndView();
		//상세정보
		Product product = this.productService.getProductById(productId);
		mav.addObject(product);
		return mav;
	}
	
	/*
	 * 상품 수정 화면
	 */
	@RequestMapping(value = "/product/edit")
	public ModelAndView edit(Integer productId){
		ModelAndView modelAndView = new ModelAndView();
		Product product = this.productService.getProductById(productId);
		
		modelAndView.addObject(product);
		return modelAndView;
	}
	
	/*
	 * 상품 수정 DB반영
	 */
	@RequestMapping(value = "/product/update")
	public ModelAndView update(Product product, BindingResult bindingResult){
		ModelAndView modelAndView = new ModelAndView();
		if(bindingResult.hasErrors()){
			modelAndView = new ModelAndView("/product/edit");
			modelAndView.getModel().putAll(bindingResult.getModel());
			return modelAndView;
		}
		this.productService.updateProduct(product);
		modelAndView.setViewName("redirect:/product/index.do");
		return modelAndView;
	}
	
	/*
	 * 상품삭제
	 */
	@RequestMapping(value = "/product/delete")
	public ModelAndView delete(Integer productId, String pageNumber){
		this.productService.deleteProduct(productId);
		ModelAndView mv = new ModelAndView("redirect:/product/index.do");
		return mv;
	}
	
}
