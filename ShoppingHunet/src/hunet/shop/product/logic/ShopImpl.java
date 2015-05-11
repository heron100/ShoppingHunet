package hunet.shop.product.logic;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopImpl implements Shop{

	@Autowired
	private ProductCatalog productCatalog;

	public List<Product> getProductList() {
		return this.productCatalog.getProductList();
	}

	@Override
	public Product getProductById(Integer productId) {
		return this.productCatalog.getProductById(productId);
	}
	
	@Override
	public List<Product> getProductListBySrchCondition(Product product) {
		return this.productCatalog.getProductListBySrchCondition(product);
	}

//	@Override
//	public User getUserByUserIdAndUserPw(String userId, String userPw) {
//		return this.userCatalog.getUserByUserIdAndUserPw(userId, userPw);
//	}
//
//	@Override
//	public void entryUser(User user) {
//		this.userCatalog.entryUser(user);
//	}

//	@Override
//	public Cart getCart() {
//		return new Cart();
//	}

//	@Override
//	public Integer calculateTotalAmount(List<ProductSet> itemList) {
//		int totalAmount = 0;
//		for(ProductSet productSet : itemList){
//			int price = productSet.getItem().getPrice().intValue();
//			int quantity = productSet.getQuantity().intValue();
//			totalAmount = totalAmount + (price * quantity);
//		}
//		return new Integer(totalAmount);
//	}

//	@Override
//	public void checkout(User user, Cart cart) {
//		Sale sale = createSale(user, cart);
//		entrySale(sale);
//	}
//	
//	private void entrySale(Sale sale){
//		this.saleCatalog.entrySale(sale);
//	}
	
//	private Sale createSale(User user, Cart cart){
//		Sale sale = new Sale();
//		sale.setSaleId(getNewSaleId());
//		sale.setUser(user);
//		Timestamp currentTime = getCurrentTime();
//		sale.setUpdateTime(currentTime);
//		
//		List<ProductSet> itemList = cart.getItemList();
//		for(int i=0; i<itemList.size(); i++){
//			ProductSet productSet = (ProductSet)itemList.get(i);
//			int saleLineId = i + 1;
//			SaleLine saleLine = createSaleLine(sale, saleLineId, productSet, currentTime);
//			sale.addSaleLine(saleLine);
//		}
//		return sale;
//	}
	
//	private Integer getNewSaleId(){
//		return this.saleCatalog.getNewSaleId();
//	}
	
	private Timestamp getCurrentTime(){
		return new Timestamp(Calendar.getInstance().getTimeInMillis());
	}
	
	private SaleLine createSaleLine(Sale sale, int saleLineId, ProductSet productSet, 
			Timestamp currentTime){
		return new SaleLine(sale, new Integer(saleLineId), productSet, currentTime);
	}

}