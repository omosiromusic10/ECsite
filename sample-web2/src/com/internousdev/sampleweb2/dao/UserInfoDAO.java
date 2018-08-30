package com.internousdev.sampleweb2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sampleweb2.dto.UserInfoDTO;
import com.internousdev.sampleweb2.util.DBConnector;

public class UserInfoDAO {
	public int createUser(String familyName, String firstName, String familyNameKana,
			String firstNameKana, String sex, String email, String loginId, String password){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "insert into user_info(user_id, password, family_name, first_name, family_name_kana,"
				+ "first_name_kana, sex, email, status, logined, regist_date, update_date)"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now(), 0)";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, familyName);
			preparedStatement.setString(4, firstName);
			preparedStatement.setString(5, familyNameKana);
			preparedStatement.setString(6, firstNameKana);
			preparedStatement.setString(7, sex);
			preparedStatement.setString(8, email);
			preparedStatement.setInt(9, 0);
			preparedStatement.setInt(10, 1);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
		//★ここはDestinationDAOでも使われていた。どういう事だろうか
	}

	public boolean isExistsUserInfo(String loginId, String password){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		boolean result = false;
		String sql = "select count(*) as count from user_info where user_id=? and password=?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginId);
			preparedStatement.setString(2,password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				if(resultSet.getInt("count") > 0){
					result = true;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}//ユーザーIDとパスワードをｾﾚｸﾄをして何をしているのか。

	public UserInfoDTO getUserInfo(String loginId, String password){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		String sql = "select * from user_info where user_id =? and password=?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				userInfoDTO.setId(resultSet.getInt("id"));
				userInfoDTO.setUserId(resultSet.getString("user_id"));
				userInfoDTO.setPassword(resultSet.getString("password"));
				userInfoDTO.setFamilyName(resultSet.getString("family_name"));
				userInfoDTO.setFirstName(resultSet.getString("first_name"));
				userInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				userInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				userInfoDTO.setSex(resultSet.getInt("sex"));
				userInfoDTO.setEmail(resultSet.getString("email"));
				userInfoDTO.setStatus(resultSet.getString("status"));
				userInfoDTO.setLogined(resultSet.getInt("logined"));
				userInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
				userInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoDTO;
	}

	public UserInfoDTO getUserInfo(String loginId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		String sql = "select * from user_info where user_id=?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				userInfoDTO.setId(resultSet.getInt("id"));
				userInfoDTO.setUserId(resultSet.getString("user_id"));
				userInfoDTO.setPassword(resultSet.getString("password"));
				userInfoDTO.setFamilyName(resultSet.getString("family_name"));
				userInfoDTO.setFirstName(resultSet.getString("first_name"));
				userInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				userInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				userInfoDTO.setSex(resultSet.getInt("sex"));
				userInfoDTO.setEmail(resultSet.getString("email"));
				userInfoDTO.setStatus(resultSet.getString("status"));
				userInfoDTO.setLogined(resultSet.getInt("logined"));
				userInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
				userInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoDTO;
	}

	public int resetPassword(String loginId, String password){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "update user_info set password=? where user_id=?";
		int result = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, loginId);
			result = preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int login(String loginId, String password){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int result = 0;
		String sql="update user_info set logined=1 where user_id=? and password=?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);
			result = preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int logout(String loginId){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int result=0;
		String sql ="update user_info set logined=0 where user_id=?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			result = preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String concealPassword(String password){
		int beginIndex = 0;
		int endIndex = 1;
		if(password.length() > 1 ){
			endIndex = 2;
		}
		StringBuilder stringBuilder = new StringBuilder("****************");

		String concealPassword = stringBuilder.replace(beginIndex, endIndex, password.substring(beginIndex,endIndex)).toString();
		return concealPassword;
	}

	/* AdminAllSelectActionで使う用
	 user_infoテーブルから全てのデータを抜き出して、UserInfoDTOListを作成する。*/
	public List<UserInfoDTO> getUserInfoAllList(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		List<UserInfoDTO> userInfoDtoList = new ArrayList<UserInfoDTO>();

		String sql = "SELECT * FROM user_info";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				UserInfoDTO userInfoDTO = new UserInfoDTO();
				userInfoDTO.setId(rs.getInt("id"));
				userInfoDTO.setUserId(rs.getString("user_id"));
				userInfoDTO.setPassword(rs.getString("password"));
				userInfoDTO.setFamilyName(rs.getString("family_name"));
				userInfoDTO.setFirstName(rs.getString("first_name"));
				userInfoDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				userInfoDTO.setFirstNameKana(rs.getString("first_name_kana"));
				userInfoDTO.setSex(rs.getInt("sex"));
				userInfoDTO.setEmail(rs.getString("email"));
				userInfoDTO.setLogined(rs.getInt("logined"));
				userInfoDTO.setStatus(rs.getString("status"));
				userInfoDTO.setRegistDate(rs.getDate("regist_date"));
				userInfoDTO.setUpdateDate(rs.getDate("update_date"));
				userInfoDtoList.add(userInfoDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userInfoDtoList;
	}
}
