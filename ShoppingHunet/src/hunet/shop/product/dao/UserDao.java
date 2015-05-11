package hunet.shop.product.dao;

import hunet.shop.product.logic.User;

public interface UserDao {
	
	User findByUserIdAndUserPw(String userId, String userPw);
	
	void create(User user);
}
