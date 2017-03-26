<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/springmvctest/css/WN.css" />
<link rel="stylesheet" type="text/css" href="/springmvctest/css/cf.css" />
<!--  <script src="../css/jquery-3.2.0.min.js"></script>
<script type="text/javascript">
	window.onload = function() {
		var t = document.getElementById("before");
		alert(t);
	}
</script>
-->
</head>
<body>
	<div id="user">
	<br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button"
			value="<%=request.getSession().getAttribute("username")%>"
			onclick="window.location.href='/springmvctest/views/login.do.jsp'" />
	</div>
	<div id="c">
		<br> <a href="/springmvctest/views/index.do.jsp">&nbsp;Customer管理</a>
	</div>
	<br>
	<div id="f">
		<br> <a href="/springmvctest/views/FileIndex.do.jsp">&nbsp;&nbsp;&nbsp;File设置</a>
	</div>
	<center>
		<h1>客户管理</h1>
		<h3 align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3>
		<form action="/springmvctest/xj" method="post">
			<input type="submit" value="新建" style="width:100;height:40">
		</form>
		<br><br>


		<table cellpadding="10" cellspacing="2" border="5px">
			<tr>
				<th>操作</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Address</th>
				<th>Email</th>
				<th>Customerid</th>
				<th>LastUpdate</th>
			</tr>

			<c:forEach items="${list}" var="tom">
				<tr>
					<th><a href="/springmvctest/views/update.jsp">编辑</a>|<a
						href="/springmvctest/views/delete.jsp?" ${tom.customerId}>删除</a></th>
					<th><input value="${tom.firstName}" style="border-style: none"
						readonly /></th>
					<th><input value="${tom.lastName}" style="border-style: none"
						readonly /></th>
					<th><input value="${tom.address}" style="border-style: none"
						readonly /></th>
					<th><input value="${tom.email}" style="border-style: none"
						readonly /></th>
					<th><input value="${tom.customerId}"
						style="border-style: none" readonly /></th>
					<th><input value="${tom.lastUpdate}"
						style="border-style: none" readonly /></th>
				</tr>
			</c:forEach>
		</table>
		<input type="button" value="上一页" id="before" />&nbsp;<input
			type="button" value="下一页" id="next" />&nbsp;<input type="button"
			value="尾页" id="last" />
	</center>
</body>
</html>