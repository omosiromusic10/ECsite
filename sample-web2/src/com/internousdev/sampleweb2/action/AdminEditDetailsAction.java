package com.internousdev.sampleweb2.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.MCategoryDAO;
import com.internousdev.sampleweb2.dao.ProductInfoDAO;
import com.internousdev.sampleweb2.dto.MCategoryDTO;
import com.internousdev.sampleweb2.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminEditDetailsAction extends ActionSupport implements SessionAware {
	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private Date releaseDate;
	private String releaseCompany;

	private Map<String, Object> session;

	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

	//情報を受け取る為の変数定義(画像情報)
	private File userImage;
	private String userImageFileName;

	public String execute()throws SQLException{

		String result = ERROR;

		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		ProductInfoDTO productInfoDTO = new ProductInfoDTO();
		productInfoDTO = productInfoDAO.getProductInfo(productId);
		session.remove("productNameErrorMessageList");
		session.remove("productNameKanaErrorMessageList");
		session.remove("productDescriptionErrorMessageList");
		session.remove("priceErrorMessageList");
		session.remove("imageFilePathErrorMessageList");
		session.remove("imageFileNameErrorMessageList");
		session.remove("releaseCompanyErrorMessageList");
		session.remove("releaseDateErrorMessageList");

		session.put("productName",productInfoDTO.getProductName());
		session.put("productNameKana", productInfoDTO.getProductNameKana());
		session.put("productDescription", productInfoDTO.getProductDescription());
		session.put("price", productInfoDTO.getPrice());
		session.put("imageFilePath", productInfoDTO.getImageFilePath());
		session.put("imageFileName", productInfoDTO.getImageFileName());
		session.put("releaseCompany", productInfoDTO.getReleaseCompany());
		session.put("releaseDate", productInfoDTO.getReleaseDate());
		session.put("productId", productInfoDTO.getProductId());

	    if(!session.containsKey("ProductInfoDtoList")){
	    	ProductInfoDAO productInfoDao = new ProductInfoDAO();
	    	productInfoDtoList = productInfoDao.getProductInfoList();
	    	session.put("productInfoDtoList", productInfoDtoList);
	    }
	    System.out.println(session.get("productInfoDtoList").toString());

	    if(!session.containsKey("mCategoryList")){
	    	MCategoryDAO mCategoryDao = new MCategoryDAO();
	    	mCategoryDtoList = mCategoryDao.getMCategoryList();
	    	session.put("mCategoryDtoList", mCategoryDtoList);
	    }
	    System.out.println(session.get("mCategoryDtoList").toString());

		//デフォルト画像から挿入コピーまで
		if(!(session.containsKey("imaeg_flg"))){
			session.put("imageFilePath", "./images/sample.jpg");
		}

		//ファイルアップロードの処理
		if(!(userImageFileName ==null)){
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("userimages");
			System.out.println("Image Location:" + filePath);
			File fileToCreate = new File(filePath,userImageFileName);


		try{
			FileUtils.copyFile(userImage, fileToCreate);
			session.put("imageFileName", userImageFileName); //こっちも変えている。
			session.put("imageFilePath", "images/"+ userImageFileName);
			session.put("image_flg", userImageFileName);
	}catch(IOException e){
			e.printStackTrace();
		}
	}

	    result = SUCCESS;
	    return result;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	public List<ProductInfoDTO> getProductInfoDtoList(){
		return productInfoDtoList;
	}
	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList){
		this.productInfoDtoList = productInfoDtoList;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

}
