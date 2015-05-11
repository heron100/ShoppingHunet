package hunet.shop.product.logic;

import hunet.shop.product.dao.UserDao;

public class UserCatalogImpl implements UserCatalog {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	@Override
	public User getUserByUserIdAndUserPw(String userId, String userPw) {
		// TODO Auto-generated method stub
		return this.userDao.findByUserIdAndUserPw(userId, userPw);
	}

	@Override
	public void entryUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.create(user);
	}

}
