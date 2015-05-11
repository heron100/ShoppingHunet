package hunet.shop.product.logic;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Sale {

	private Integer saleId;

	private User user;

	private Timestamp updateTime;

	private List<SaleLine> saleLineList = new ArrayList<SaleLine>();

	public void addSaleLine(SaleLine saleLine) {
		this.saleLineList.add(saleLine);
	}

	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public List<SaleLine> getSaleLineList() {
		return this.saleLineList;
	}

	public void setSaleLineList(List<SaleLine> saleLineList) {
		this.saleLineList = saleLineList;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}