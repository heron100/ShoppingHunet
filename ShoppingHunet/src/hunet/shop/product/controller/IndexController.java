package hunet.shop.product.controller;

import hunet.shop.product.logic.Product;
import hunet.shop.product.logic.Shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@Autowired
	private Shop shopService;

	/*
	 * 상품 리스트 취득
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() throws Exception{
		List<Product> productList = this.shopService.getProductList();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("productList", productList);
		return mav;
	}
	
	/*
	 * 검색 결과 리스트 취득
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView search(String srchProductName, String srchProductCode) throws Exception{
		Product product = new Product();
		product.setSrchProductName(srchProductName);
		product.setSrchProductCode(srchProductCode);
		List<Product> productList = this.shopService.getProductListBySrchCondition(product);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("productList", productList);
		return mav;
	}
}