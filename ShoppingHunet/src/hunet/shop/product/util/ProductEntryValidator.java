package hunet.shop.product.util;

import hunet.shop.product.logic.Product;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductEntryValidator implements Validator{
	public boolean supports(Class<?> clazz){
		return Product.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object command, Errors errors){
		Product product = (Product)command;
		
		if(!StringUtils.hasLength(product.getProductName())){
			errors.rejectValue("productName", "error.required");
		}
		
		if(!StringUtils.hasLength(product.getProductCode())){
			errors.rejectValue("productCode", "error.required");
		}
		
//		if(!StringUtils.hasLength(product.getSummary())){
//			errors.rejectValue("summary", "error.required");
//		}
//		
//		if(!StringUtils.hasLength(product.getDetail())){
//			errors.rejectValue("detail", "error.required");
//		}
//		
//		if(!StringUtils.hasLength(product.getMobileDetail())){
//			errors.rejectValue("mobileDetail", "error.required");
//		}
		
		if(errors.hasErrors()){
			errors.reject("error.input.product");
		}
	}
}
