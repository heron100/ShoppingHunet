package hunet.shop.product.dao;

import hunet.shop.product.logic.SaleLine;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SaleLineDaoImpl implements SaleLineDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void create(SaleLine saleLine) {
		sqlSessionTemplate.insert("insertItem");
	}
}