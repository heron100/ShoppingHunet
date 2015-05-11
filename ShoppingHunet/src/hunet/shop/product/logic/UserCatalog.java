package hunet.shop.product.logic;

public interface UserCatalog {
	
	User getUserByUserIdAndUserPw(String userId, String UserPw);
	
	void entryUser(User user);
}
