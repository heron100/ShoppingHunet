package hunet.shop.product.dao;

import hunet.shop.product.logic.Product;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	//상품리스트
	public List<Product> findAll() {
		return sqlSessionTemplate.selectList("selectAllProduct");
	}

	//상품상세
	@Override
	public Product findByPrimaryKey(Integer productId) {
		return sqlSessionTemplate.selectOne("selectProductById", productId);
	}

	//상품검색
	@Override
	public List<Product> findAllByProductCondition(Product product) {
		System.out.println("ooo________>"+product.getSrchProductName());
		return sqlSessionTemplate.selectList("searchProduct", product);
	}

	//상품등록
	@Override
	public void create(Product product) {
		sqlSessionTemplate.insert("insertProduct", product);
	}

	//업로드 이미지 반영
	@Override
	public void applyImageName(Product product) {
		sqlSessionTemplate.update("updateProductImageName", product);
	}

	//상품수정
	@Override
	public void updateProduct(Product product) {
		sqlSessionTemplate.update("updateProduct", product);
	}

	//상품삭제
	@Override
	public void deleteProduct(Integer productId) {
		sqlSessionTemplate.delete("deleteProduct", productId);
	}

}