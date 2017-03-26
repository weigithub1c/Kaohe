<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.do</title>
<link rel="stylesheet" type="text/css" href="/springmvctest/css/WN.css" />
</head>
<body>
<br><br><br><br><br><br>
	<center>
		<h1>创建Customer</h1>
		<h3>基本信息</h3>

		<form action="/springmvctest/insert" method="post">
			FirstName：<input type="text" required="required" name="FirstName"></input>
			&nbsp;LastName：<input type="text" required="required" name="LastName"></input>
			&nbsp;Email：<input type="text" required="required" name="Email"></input>&nbsp;
			Address：
			<select name="Address">
				<c:forEach items="${list}" var="add">
					<option>${add.address}</option>
				</c:forEach>
			</select> <br><br><br><br><br>
			<form action="insert" method="post">
				<button typle="submit">新建</button>
				<button typle="reset">取消</button>
			</form>
			<br>
			<br> <a href="/springmvctest/views/login.do.jsp">返回登陆页面</a>
	</center>
</body>
</html>