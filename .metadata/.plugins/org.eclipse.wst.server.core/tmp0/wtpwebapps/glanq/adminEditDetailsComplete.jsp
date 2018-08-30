<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta http-equiv="refresh" content="3;URL='GoAdminAction'" />
<link rel = "stylesheet" href = "./css/style.css">
<title>商品更新登録完了</title>
</head>
<body>
<jsp:include page = "header.jsp" />
<div id = "contents">
	<h1>商品更新登録完了</h1>
		<div class = "success">
		<div>
			<img class = "kusa" src= "images/kusa.svg">
			<img class = "ushi" src= "images/ushi.svg">
			<img class = "kusa" src= "images/kusa.svg">
		</div>
		<p>
		商品情報の更新登録が完了しました。	<br>
		</p>
		</div>
</div>

	<s:include value="footer.jsp"/>

</body>
</html>