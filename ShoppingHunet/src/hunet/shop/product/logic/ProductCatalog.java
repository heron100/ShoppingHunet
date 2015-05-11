package hunet.shop.product.logic;

import java.util.List;

public interface ProductCatalog {
	
	List<Product> getProductList();

	Product getProductById(Integer productId);

	List<Product> getProductListBySrchCondition(Product product);
}