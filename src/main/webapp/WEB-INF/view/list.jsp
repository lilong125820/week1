<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div style="margin-left: 100px">
	<form action="list" method="post">
		<div>
			<input type="text" name="name" value="${name}"> 
			<button>查询</button>
			<button type="button" onclick="add()">添加</button>
		</div>
		<c:forEach items="${page.list}" var="li">
			<div style="float: left">
				<img alt="" src="/pic/${li.pic}" width="120px" height="50px"><br>
				商品名称:${li.name}<br>英文名称:${li.ename}<br>尺寸:${li.cc}<br>
				商品价格:${li.price}<br>标签:${li.bq}<br>
				<button type="button" onclick="ds(${li.gid})">删除</button>
				<button type="button" onclick="xg(${li.gid})">修改</button>
				<button type="button" onclick="select(${li.gid})">商品详情</button>
				<br>
				<input type="checkbox" class="xz" value="${li.gid}">
			</div>
		</c:forEach>
		<div style="clear: both">
			<button type="button" onclick="delAll()">批删</button>
		</div>
		<div style="clear: both">
				<button name="page" value="1">首页</button>
				<button name="page" value="${page.prePage==0?1:page.prePage}">上一页</button>
				<button name="page" value="${page.nextPage==0?page.pages:page.nextPage}">下一页</button>
				<button name="page" value="${page.pages}">尾页</button>
			</div>
	</form>
	</div>
</body>
<script type="text/javascript">
	function add() {
		location="toadd";
	}
	function ds(id) {
		if(confirm("确定要删除吗")){
			location="deleteone?id="+id
		}
	}
	function delAll() {
		 var ids=$(".xz:checked").map(function(){
			return this.value
		}).get().join()
		if(confirm("确定要删除吗")){
			location="delAll?ids="+ids
		}
	}
	function xg(id) {
		location="toupdate?id="+id
	}
	function select(id) {
		location="select?id="+id
	}
</script>
</html>