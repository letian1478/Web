<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script  src="http://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	//alert("aa");
})
function cx() {
	var mechk = $("[name='mechk']").val();
	location.href = "list?mechk="+mechk;
}
</script>
<body>
<center>
<form action="">
订单编号：
<input type="text" name="mechk">
<input type="button" value="查询" onclick="cx()">(可根据商品id，类型，支付方式查询)
</form>
</center>
	<table class="table table-bordered">
		<tr>
			<td>订单编号</td>
			<td>订单用户</td>
			<td>购买金额</td>
			<td>创建时间</td>
			<td>支付类型</td>
			<td>订单状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="li">
			<tr>
				<td>${li.id }</td>
				<td>${li.username }</td>
				<td>${li.jine }</td>
				<td>${li.createdate }</td>
				<td>${li.ztype }</td>
				<td>
				<c:if test="${li.zstatus==1 }">
				已经支付
				</c:if>
				<c:if test="${li.zstatus==0 }">
				待支付
				</c:if>
				<c:if test="${li.zstatus==2 }">
				待提交
				</c:if>
				</td>
			<td>
				<c:if test="${li.zstatus==1 }">
				<input type="button" value="删除" onclick="tj()">
				<input type="button" value="查看" onclick="ck()">
				</c:if>
				<c:if test="${li.zstatus==0 }">
				<input type="button" value="支付" onclick="zf()">
				<input type="button" value="删除" onclick="sc()">
				<input type="button" value="查看" onclick="ck()">
				</c:if>
				<c:if test="${li.zstatus==2 }">
				<input type="button" value="提交" onclick="tj()">
				<input type="button" value="删除" onclick="sc()">
				<input type="button" value="编辑" onclick="bj()">
				</c:if>
				
			</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>