package hunet.shop.product.logic;

import java.util.List;

/*
 * 관리자의 관리용
 */
public interface ProductService {
	
	//상품리스트
	List<Product> getProductList();
	
	//상품상세
	Product getProductById(Integer productId);
	
	//상품검색
	List<Product> getProductListBySrchCondition(Product product);
	
	//상품등록
	void entryProduct(Product product);
	
	//업로드 파일명 반영
	void updateImageName(Product product);

	//상품수정
	void updateProduct(Product product);

	//상품삭제
	void deleteProduct(Integer productId);
}
