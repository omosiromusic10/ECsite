package com.internousdev.sampleweb2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.MCategoryDAO;
import com.internousdev.sampleweb2.dao.ProductInfoDAO;
import com.internousdev.sampleweb2.dto.MCategoryDTO;
import com.internousdev.sampleweb2.dto.PaginationDTO;
import com.internousdev.sampleweb2.dto.ProductInfoDTO;
import com.internousdev.sampleweb2.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class AdminEditAction extends ActionSupport implements SessionAware {
	//情報を受け取る為に変数定義
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private int price;

	private String categoryId;
	private String keywords;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;

	//SeachItemAction(ページ情報)の追加
	private int pageNo;

	public String execute()throws SQLException {

		String result = "errorhome";
		String token = String.valueOf(session.get("token"));
		if (token != "admin") {
			return result;
		}

	result = ERROR;

	ProductInfoDAO productInfoDao = new ProductInfoDAO();
	productInfoDtoList = productInfoDao.getProductInfoList();

	// キーが存在するか確認
	if (!session.containsKey("mCategoryList")) {
		MCategoryDAO mCategoryDao = new MCategoryDAO();
		mCategoryDtoList = mCategoryDao.getMCategoryList();
		session.put("mCategoryDtoList2", mCategoryDtoList);
	}

	//ページャーの為の処理
	if(!(productInfoDtoList==null)){
	Pagination pagination = new Pagination();
	PaginationDTO paginationDTO = new PaginationDTO();
	if(pageNo == 0){
		paginationDTO = pagination.initialize(productInfoDtoList, 9);
	}else{
		paginationDTO = pagination.getPage(productInfoDtoList, 9, pageNo);
	}
	//ページ情報をsessionに格納。
	session.put("totalPageSize", paginationDTO.getTotalPageSize());
	session.put("currentPageNumber", paginationDTO.getCurrentPageNo());
	session.put("totalRecordSize", paginationDTO.getTotalRecordSize());
	session.put("startRecordNo", paginationDTO.getStartRecordNo());
	session.put("endRecordNo", paginationDTO.getEndRecordNo());
	session.put("pageNumberList", paginationDTO.getPageNumberList());
	session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
	session.put("hasNextPage", paginationDTO.isHasNextPage());
	session.put("hasPreviousPage", paginationDTO.isHasPreviousPage());
	session.put("nextPageNo", paginationDTO.getNextPageNo());
	session.put("previousPageNo", paginationDTO.getPreviousPageNo());
	}

    result = SUCCESS;
    return result;

	}

	public List<MCategoryDTO> getmCategoryDtoList(){
		return mCategoryDtoList;
	}
	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList){
		this.mCategoryDtoList = mCategoryDtoList;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
