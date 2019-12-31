<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%= request.getContextPath() %>/resources/css/css.css" rel="stylesheet"type="text/css"/>
<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form:form action="upadte" method="post" modelAttribute="g">
		<table>
			<tr>
				<td>商品图片</td>
				<td>
					<img alt="" src="/pic/${g.pic}" width="50px" height="50px">
				</td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td>
					<form:input path="name"/>
				</td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td>
					<form:input path="ename"/>
				</td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td>
					<form:input path="price"/>
				</td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td>
					<form:input path="number"/>
				</td>
			</tr>
			<tr>
				<td>商品尺寸</td>
				<td>
					<form:input path="cc"/>
				</td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td>
					<form:input path="gname"/>
				</td>
			</tr>
			<tr>
				<td>商品类型</td>
				<td>
					<form:input path="bname"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
<script type="text/javascript">
</script>
</html>