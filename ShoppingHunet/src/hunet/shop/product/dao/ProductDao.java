package hunet.shop.product.dao;

import hunet.shop.product.logic.Product;

import java.util.List;

public interface ProductDao {

	//상품리스트
	List<Product> findAll();

	//상품상세
	Product findByPrimaryKey(Integer productId);
	
	//상품검색
	List<Product> findAllByProductCondition(Product product);

	//상품등록
	void create(Product product);

	//업로드 이미지 반영
	void applyImageName(Product product);

	//상품수정
	void updateProduct(Product product);

	//상품삭제
	void deleteProduct(Integer productId);
}