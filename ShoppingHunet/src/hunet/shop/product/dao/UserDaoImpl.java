package hunet.shop.product.dao;

import hunet.shop.product.logic.User;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User findByUserIdAndUserPw(String userId, String userPw) {
		return sqlSessionTemplate.selectOne("selectUser");
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}
}
