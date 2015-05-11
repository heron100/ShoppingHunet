package hunet.shop.product.dao;

import hunet.shop.product.logic.Sale;

public interface SaleDao {

	void create(Sale sale);

	Integer findMaxSaleId();
}