package hunet.shop.product.logic;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Product  {
	private int productId;
	private int categoryId;
	private String brand;
	private String productName;
	private String productNameEng;
	private String productCode;
	private int price;
	private String imageUser;
	private String imageSystem;
	private MultipartFile productImg;
	private int discount;
	private int pointRate;
	private String summary;
	private String detail;
	private String mobileDetail;
	private int stateId;
	private int hasOption;
	private int storage;
	private Date registTime;
	private int hit;
	
	/*
	 * 검색조건
	 */
	private String srchProductName;
	private String srchProductCode;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameEng() {
		return productNameEng;
	}
	public void setProductNameEng(String productNameEng) {
		this.productNameEng = productNameEng;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getImageUser() {
		return imageUser;
	}
	public void setImageUser(String imageUser) {
		this.imageUser = imageUser;
	}
	public String getImageSystem() {
		return imageSystem;
	}
	public void setImageSystem(String imageSystem) {
		this.imageSystem = imageSystem;
	}
	public MultipartFile getProductImg() {
		return productImg;
	}
	public void setProductImg(MultipartFile productImg) {
		this.productImg = productImg;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPointRate() {
		return pointRate;
	}
	public void setPointRate(int pointRate) {
		this.pointRate = pointRate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getMobileDetail() {
		return mobileDetail;
	}
	public void setMobileDetail(String mobileDetail) {
		this.mobileDetail = mobileDetail;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getHasOption() {
		return hasOption;
	}
	public void setHasOption(int hasOption) {
		this.hasOption = hasOption;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getSrchProductName() {
		return srchProductName;
	}
	public void setSrchProductName(String srchProductName) {
		this.srchProductName = srchProductName;
	}
	public String getSrchProductCode() {
		return srchProductCode;
	}
	public void setSrchProductCode(String srchProductCode) {
		this.srchProductCode = srchProductCode;
	}
	
}
