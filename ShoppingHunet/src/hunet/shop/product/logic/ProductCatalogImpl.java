package hunet.shop.product.logic;

import hunet.shop.product.dao.ProductDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCatalogImpl implements ProductCatalog {
	@Autowired
	private ProductDao productDao;
	
	public List<Product> getProductList() {
		return this.productDao.findAll();
	}

	@Override
	public Product getProductById(Integer productId) {
		return this.productDao.findByPrimaryKey(productId);
	}

	@Override
	public List<Product> getProductListBySrchCondition(Product product) {
		return this.productDao.findAllByProductCondition(product);
	}
}