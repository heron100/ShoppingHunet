package hunet.shop.product.logic;

import hunet.shop.product.dao.SaleDao;
import hunet.shop.product.dao.SaleLineDao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SaleCatalogImpl implements SaleCatalog {

	private SaleDao saleDao;
	private SaleLineDao saleLineDao;
	
	public void setSaleDao(SaleDao saleDao) {
		this.saleDao = saleDao;
	}
	
	public void setSaleLineDao(SaleLineDao saleLineDao){
		this.saleLineDao = saleLineDao;
	}

	public void entrySale(Sale sale) {

		this.saleDao.create(sale);

		List<SaleLine> saleLineList = sale.getSaleLineList();
		for (SaleLine saleLine : saleLineList) {
			this.saleLineDao.create(saleLine);
		}
	}

	public Integer getNewSaleId() {
		int newSaleId = this.saleDao.findMaxSaleId().intValue() + 1;
		return new Integer(newSaleId);
	}
}