package hunet.shop.product.logic;

public class ProductSet {
	private Product product;
	private Integer quantity;

	public ProductSet(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public void addQuantity(Integer addQuantity) {
		int addQuantityInt = addQuantity.intValue();
		int existQuantityInt = getQuantity().intValue();
		setQuantity(new Integer(addQuantityInt + existQuantityInt));
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
}
