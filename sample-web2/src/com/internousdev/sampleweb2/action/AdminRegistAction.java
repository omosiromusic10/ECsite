package com.internousdev.sampleweb2.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.MCategoryDAO;
import com.internousdev.sampleweb2.dto.MCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminRegistAction extends ActionSupport implements SessionAware{
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private String releaseCompany;
	private String releaseDate;
	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	private List<MCategoryDTO> mCategoryList = new ArrayList<MCategoryDTO>();
	private List<String> categoryIdList = new ArrayList<String>();
	private static final String BOOK = "本";
	private static final String DENKI ="家電・PC";
	private static final String GAME = "おもちゃ・ゲーム";
	private static final String SONOTA = "その他";
	//これの指定方法は　それぞれ種類を選択させてあげている状態なので実際にcategoryIdを挿入出来ているのかは不明である。
	//正直あっているかわからない。　性別を元にして作成している。
	private String defaultCategoryIdValue = BOOK;
	private Map<String, Object> session;
	private String categoryId;

	public String execute(){
		String result = ERROR;

		session.remove("productNameErrorMessageList");
		session.remove("productNameKanaErrorMessageList");
		session.remove("productDescriptionErrorMessageList");
		session.remove("priceErrorMessageList");
		session.remove("imageFilePathErrorMessageList");
		session.remove("imageFileNameErrorMessageList");
		session.remove("releaseCompanyErrorMessageList");
		session.remove("releaseDateErrorMessageList");

		session.put("productName",productName);
		session.put("productNameKana", productNameKana);
		session.put("productDescription", productDescription);
		session.put("price", price);
		session.put("imageFilePath", imageFilePath);
		session.put("imageFileName", imageFileName);
		session.put("releaseCompany", releaseCompany);
		session.put("relaseDate", releaseDate);
		session.put("categoryId", categoryId);
		if(categoryId==null){
			session.put("categoryId", SONOTA);
		}else{
			session.put("categoryId", String.valueOf(session.get("categoryId")));
		}
		categoryIdList.add(BOOK);
		categoryIdList.add(DENKI);
		categoryIdList.add(GAME);
		categoryIdList.add(SONOTA);
		session.put("categoryIdList", categoryIdList);
		System.out.println(session.get("mCategoryDtoList").toString());


		MCategoryDAO mCategoryDao = new MCategoryDAO();

		setmCategoryList(mCategoryDao.getMCategoryList());



		result = SUCCESS;
		return result;
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
	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName(){
		return imageFileName;
	}
	public void setImageFileName(String imageFileName){
		this.imageFileName = imageFileName;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session =  session;
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
	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}
	public List<String> getCategoryIdList() {
		return categoryIdList;
	}
	public void setCategoryIdList(List<String> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}
	public String getDefaultCategoryIdValue() {
		return defaultCategoryIdValue;
	}
	public void setDefaultCategoryIdValue(String defaultCategoryIdValue) {
		this.defaultCategoryIdValue = defaultCategoryIdValue;
	}
	public File getUserImage() {
		return userImage;
	}
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	public List<MCategoryDTO> getmCategoryList() {
		return mCategoryList;
	}
	public void setmCategoryList(List<MCategoryDTO> mCategoryList) {
		this.mCategoryList = mCategoryList;
	}

}