package com.internousdev.sampleweb2.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.ProductInfoDAO;
import com.internousdev.sampleweb2.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminDeleteCompleteAction extends ActionSupport implements SessionAware {
	private Collection<String> checkList;
	private String categoryId;
	private String productId;

	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private String price;
	private String releaseCompany;
	private String releaseDate;
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		int count = 0;
		List<String> checkListErrorMessageList = new ArrayList<String>();
		if(checkList==null){
			checkListErrorMessageList.add("チェックされていません。");
			session.put("checkListErrorMessageList",checkListErrorMessageList);
			return ERROR;
		}

		for(String id:checkList){
			System.out.println(id);
			count += productInfoDAO.delete(id);
		}
		if(count <= 0){
			checkListErrorMessageList.add("チェックされていません。");
			session.put("checkListErrorMessageList", checkListErrorMessageList);
			return ERROR;
		}else{
			List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
			productInfoDtoList = productInfoDAO.getProductInfoList();
			Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
			if(!(iterator.hasNext())){
				productInfoDtoList =null;
			}
			session.put("productInfoDtoList", productInfoDtoList);

			result = SUCCESS;
	}
		return result;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
