<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<%= request.getContextPath() %>/resources/css/css.css" rel="stylesheet"type="text/css"/>
<script type="text/javascript" src="/resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form:form action="add" method="post" modelAttribute="goods">
		<table>
		
			<tr>
				<td>商品图片:</td>
				<td>
					<input type="file" name="file">
				</td>
			</tr>
			<tr>
				<td>商品名称:</td>
				<td>
					<form:input path="name"/>
				</td>
			</tr>
			<tr>
				<td>英文名称:</td>
				<td>
					<form:input path="ename"/>
				</td>
			</tr>
			<tr>
				<td>商品品牌:</td>
				<td>
					<select id="aa">
					
					</select>
				</td>
			</tr>
			<tr>
				<td>商品类型:</td>
				<td>
					<select id="bb">
					</select>
				</td>
			</tr>
			<tr>
				<td>商品尺寸:</td>
				<td>
					<form:input path="cc"/>
				</td>
			</tr>
			<tr>
				<td>单价:（元）:</td>
				<td>
					<form:input path="price"/>
				</td>
			</tr>
			<tr>
				<td>数量:（元）:</td>
				<td>
					<form:input path="number"/>
				</td>
			</tr>
			<tr>
				<td>标签:</td>
				<td>
					<form:input path="bq"/>
				</td>
			</tr>
			<tr>
				<td colspan="100">
					<button>添加</button>
				</td>
			</tr>
		</table>
	</form:form>
</body>
<script type="text/javascript">
	$(function() {
		$.post("getbrand",{},function(obj){
			for ( var i in obj) {
				$("#bb").append("<option value='"+obj[i].bid+"' name='bid'>"+obj[i].bname+"</option>");
			}
		},"json")
		$.post("gets",{},function(obj){
			for ( var i in obj) {
				$("#aa").append("<option value='"+obj[i].g_sid+"' name='g_sid'>"+obj[i].gname+"</option>");
			}
		},"json")
	})
</script>
</html>