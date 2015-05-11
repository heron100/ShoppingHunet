package hunet.shop.product.controller;

import hunet.shop.product.logic.Product;
import hunet.shop.product.logic.Shop;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailController {
	@Autowired
	private Shop shopService;
	
	@RequestMapping
	public ModelAndView  detailProduct(Integer productId){
		Product product = this.shopService.getProductById(productId);

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("product", product);

		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("detail");
		modelAndView.addAllObjects(model);

		return modelAndView;

	}
}