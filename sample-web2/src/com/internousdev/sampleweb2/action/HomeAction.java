package com.internousdev.sampleweb2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb2.dao.MCategoryDAO;
import com.internousdev.sampleweb2.dto.MCategoryDTO;
import com.internousdev.sampleweb2.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>(); //ここでDAOに入れていた奴を使う用にコマンド
	private String categoryId;
	private Map<String, Object> session;
	public String execute(){

		if(!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))){
			CommonUtility commonUtility = new CommonUtility();
			session.put("tempUserId", commonUtility.getRamdomValue());
			//session内のloginId と ゲストIDが存在しない場合に限り、CommonUtilityで使われている謎のﾊﾞﾘｭｰが使われる。
			//そしてsessionにはゲストＩＤと謎のバリューが残る。
		}
		if(!session.containsKey("logined")){
			session.put("logined", 0);
			//ログイン前であれば、loginedを0にする？
			//そしてsessionにloginedした物をputしている。
		}

		if(!session.containsKey("mCategoryList")){
			//ここではsessionの mCategoryListが存在しない場合？に起きる。
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			//ここで恐らく、mCategoryDAO内にあるMCategoryListを「DtoList」として代入している
			session.put("mCategoryDtoList", mCategoryDtoList);
			//そして最後にsessionにmCategoryDtoListを記述させている。 ただ、何故DtoListとしてしたのか。　そのままmCategoryListじゃだめなのか。
			//これはヘッダー部分で検索機能として置いているのでエラーを出さないようにする為の処置
		}
		return SUCCESS;
	}
	public String getCategiryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}
	public List<MCategoryDTO> getCategoryDtoList(){
		return mCategoryDtoList;
	}
	public void setCategoryDtoList(List<MCategoryDTO> mCategoryDtoList){
		this.mCategoryDtoList = mCategoryDtoList;
	}
		public Map<String,Object>getSession(){
			return session;
		}
		public void setSession(Map<String, Object> session){
			this.session= session;
	}

}
