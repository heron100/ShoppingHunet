package hunet.shop.product.logic;

import java.sql.Timestamp;

public class SaleLine {

	private Sale sale;

	private Integer saleLineId;

	private Product product;

	private Timestamp updateTime;

	private Integer quantity;

	public SaleLine(Sale sale, Integer saleLineId, ProductSet productSet, Timestamp currentTime) {
		this.sale = sale;
		this.saleLineId = saleLineId;
		this.product = productSet.getItem();
		this.quantity = productSet.getQuantity();
		this.updateTime = currentTime;
	}

	public Product getItem() {
		return this.product;
	}

	public void setItem(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Sale getSale() {
		return this.sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Integer getSaleLineId() {
		return this.saleLineId;
	}

	public void setSaleLineId(Integer saleLineId) {
		this.saleLineId = saleLineId;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
}