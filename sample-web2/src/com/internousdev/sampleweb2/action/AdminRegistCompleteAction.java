package com.internousdev.sampleweb2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.ProductInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminRegistCompleteAction extends ActionSupport implements SessionAware{

	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int price;
	private String releaseCompany;
	private String releaseDate;
	private int Status;
	private String imageFileName;
	private String imageFilePath;
	private String userImageFileName;
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		ProductInfoDAO ProductInfoDao = new ProductInfoDAO();
		int count = ProductInfoDao.createProduct(productId, productName, productNameKana, productDescription, categoryId,  price, releaseCompany, releaseDate,   imageFileName, imageFilePath,Status);
		if (count > 0){
			result = SUCCESS;
		}
		return result;
	}

	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}
	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductNameKana(){
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana){
		this.productNameKana = productNameKana;
	}
	public String getProductDescription(){
		return productDescription;
	}
	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getReleaseCompany(){
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany = releaseCompany;
	}
	public String getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	public String getImageFileName(){
		return imageFileName;
	}
	public void setImageFileName(String imageFileName){
		this.imageFileName = imageFileName;
	}
	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
	public String getUserImageFileName(){
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName){
		this.userImageFileName = userImageFileName;
	}

}
