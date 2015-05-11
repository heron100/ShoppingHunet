package hunet.shop.product.logic;

import java.util.List;

/*
 * 고객용
 */
public interface Shop {
	
	List<Product> getProductList();

	Product getProductById(Integer itemId);

	List<Product> getProductListBySrchCondition(Product product);

	//User getUserByUserIdAndUserPw(String userId, String userPw);
	
	//void entryUser(User user);
	
	//Cart getCart();
	
	//Integer calculateTotalAmount(List<ProductSet> itemList);
	
	//void checkout(User user, Cart cart);
}