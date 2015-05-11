package hunet.shop.product.logic;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<ProductSet> itemList = new ArrayList<ProductSet>();
	
	public List<ProductSet> getItemList(){
		return this.itemList;
	}
	
	public boolean isEmpty(){
		if(this.itemList == null || this.itemList.isEmpty()){
			return true;
		}
		return false;
	}
	
//	public void push(ProductSet pushedItemSet){
//		boolean itemExistInCart = false;
//		
//		Product pushedItem = pushedItemSet.getItem();
//		int pushedItemId = pushedItem.getItemId().intValue();
//		
//		for(ProductSet cartItemSet : this.itemList){
//			
//			Product cartItem = cartItemSet.getItem();
//			int cartItemId = cartItem.getItemId().intValue();
//			
//			if(cartItemId == pushedItemId){
//				cartItemSet.addQuantity(pushedItemSet.getQuantity());
//				itemExistInCart = true;
//				break;
//			}
//		}
//		
//		if(!itemExistInCart){
//			this.itemList.add(pushedItemSet);
//		}
//	}
	
	public void clearAll(){
		this.itemList = new ArrayList<ProductSet>();
	}
}
