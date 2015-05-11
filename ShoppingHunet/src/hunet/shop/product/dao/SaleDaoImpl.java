package hunet.shop.product.dao;

import hunet.shop.product.logic.Sale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SaleDaoImpl implements SaleDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void create(Sale sale) {
		sqlSessionTemplate.selectList("selectAllNews");
	}

	@Override
	public Integer findMaxSaleId() {
		return sqlSessionTemplate.selectOne("selectAllNews");
	}


}