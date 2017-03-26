<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
	<h3>工号：13271</h3>
	<div id="login">
		<h4>电影租凭管理系统</h4>
		<form action="/springmvctest/login" method="post">
			用户名：<input type="text" required="required" placeholder="用户名" name="username"></input>
			密码：<input type="password" required="required" placeholder="密码"
				name="password"></input>
			<button class="but" type="submit">登录</button>
		</form>
	</div>

</body>
</html>