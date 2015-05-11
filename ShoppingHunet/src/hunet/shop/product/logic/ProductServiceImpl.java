package hunet.shop.product.logic;

import hunet.shop.product.dao.ProductDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	//상품리스트
	@Override
	public List<Product> getProductList() {
		return this.productDao.findAll();
	}

	//상품상세
	@Override
	public Product getProductById(Integer itemId) {
		return this.productDao.findByPrimaryKey(itemId);
	}

	//상품검색
	@Override
	public List<Product> getProductListBySrchCondition(Product product) {
		return this.productDao.findAllByProductCondition(product);
	}

	//상품등록
	@Override
	public void entryProduct(Product product) {
		this.productDao.create(product);
	}
	
	//업로드 파일명 반영
	@Override
	public void updateImageName(Product product) {
		this.productDao.applyImageName(product);
	}

	//상품수정
	@Override
	public void updateProduct(Product product) {
		this.productDao.updateProduct(product);
	}

	//상품삭제
	@Override
	public void deleteProduct(Integer productId) {
		this.productDao.deleteProduct(productId);
	}

}
