<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/WN.css" />
</head>
<body>
<br><br>

	<center>
	<br><br><br><br><br><br>
	<h1>删除Customer</h1>
	<h3>请输入要删除的Customer id</h3>
		<form action="/springmvctest/delete" method="post">
			请输入Customer id：<input type="text" required="required" name="customerid"></input>
			<button type="submit">确认</button><button type="reset">取消</button>
		</form><br><br><a href="/springmvctest/views/login.do.jsp"><input type="button" value="返回登陆页面"></a>
		
	</center>
	
	
</body>
</html>