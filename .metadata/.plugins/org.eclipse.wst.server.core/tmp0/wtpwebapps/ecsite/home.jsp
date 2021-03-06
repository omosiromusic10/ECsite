<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Home画面</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<style type="text/css">
body{
  margin: 0;
  padding: 0;
  lien-height: 1.6;
  letter-spacing: 1px;
  font-family:Verdana, Helvetica, sans-serif;
  font-size: 12px;
  color: #333;
  background: #fff;
  background-image:url("./img/image6.jpg");
}
table{
  text-align: center;
  margin: 0 auto;
}
/* ========ecsite LAYOUT======== */
#top{
  width: 780px;
  margin: 30px auto;
  padding: 0.5em;
  color: #010101;
  font-size:20px;
  background: #eaf3ff;
  border-bottom: solid 3px #516ab6;
  height: 60px;
}
#header{
  width: 100%;
  height: 80px;
  osition: relative;
  padding: 0.2em 0.5em;
  background: -moz-linear-gradient(to right, rgb(111, 124, 255), #ffc994);
  background: -webkit-linear-gradient(to right, rgb(111, 124, 255), #ffc994);
  background: linear-gradient(to right, rgb(111, 124, 255), #ffc994);
  color: white;
  font-weight: lighter;
  box-shadow: 0 0 4px rgba(0, 0, 0, 0.56);
}
.logo{
  float:left;
  width:200px;
  padding-left:10px;
  color:white;
  font-size:25px;
  line-height:80px;
}

#header ul{
  float:right;
  line-height:50px;
}
#header ul li{
  float:left;
  list-style:none;
  padding-right:40px;
  color:white;
  font-size:18px;
}
.home a {
  text-decoration:none;
  color:white;
}
#main{
  width: 100%;
  height: 600px;
  text-align: center;
}
#footer{
  width: 100%;
  height: 80px;
  background-color: black;
  clear: both;
}
#text-center{
  display: inline-block;
  text-align: center;
}
</style>
<script type="text/javascript">
    jQuery(function(){
    $(document).ready(function(){
      $('.slider').bxSlider({
		 auto:true,
		  mode:'horizontal',
		  speed:2000,
		  slideWidth:300
    });
	});
    $(function(){
    $(".home a").hover(
    function(){
    	$(this).css("color","gray");
    },
    function(){
    	$(this).css("color","white");
    });
    });
    });
  </script>
</head>
<body>
    <div id="header">
        <div id="pr">
	 <div class="logo">ECサイトロゴ！</div>
	 <ul class="home">
	     <li><a href="home.jsp">ホーム</a></li><!--  ただhomeページに戻すだけ-->
	     <li><a href='<s:url action="HomeAction"  />'>購入履歴</a></li>
	     <li><a href='<s:url action="ReviewAction" />'>レビュー掲示板</a></li>
	     <li><a href='<s:url action="InquiryAction" />'>お問い合わせ</a></li>
	     <li><a href='<s:url action="LogoutAction"  />'>ログアウト</a></li>
	 </ul>
	 </div>
        </div>
    <div id="main">
        <div id="top">
            <p>Home</p>
        </div>
        <div id="text-center">
            <s:form action="HomeAction">
                <s:submit value="商品購入"/>
            </s:form>
            <s:if test="#session.id !=null">
                <p>ログアウトする場合は
                    <a href='<s:url action="LogoutAction" />'>こちら</a></p>
            </s:if>
            <div class="slider">
	<div><img src="./img/images.jpg"></div>
	<div><img src="./img/image2.jpg"></div>
	<div><img src="./img/image3.jpg"></div>
	<div><img src="./img/image4.jpg"></div>
	<div><img src="./img/image5.jpg"></div>
</div>
        </div>
    </div>
    <div id="footer">
        <div id="pr">
        </div>
    </div>

</body>
</html>