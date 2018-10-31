<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>商品一覧</h2>
<table>
<c:forEach var="item" items="${items}" varStatus="status">
<tr>
<td><c:out value="${item.name}"/> <fmt:formatNumber value="${item.price}" pattern="###,###円"/></td>
<td><form action="${pageContext.request.contextPath}/shoppingCart/inCart" method="post">
<input type="hidden" value="${status.index}" name="itemNum">
<input type="submit" value="カートへ">
</form></td>
</tr>
</c:forEach>
</table>
<h2>ショッピングカート</h2>
<table>
<c:forEach var="item" items="${cartItems}" varStatus="status">
<tr>
<td><c:out value="${item.name}"/> <fmt:formatNumber value="${item.price}" pattern="###,###円"/></td>
<td><form action="${pageContext.request.contextPath}/shoppingCart/outCart" method="post">
<input type="hidden" value="${status.index}" name="itemNum">
<input type="submit" value="削除">
</form></td>
</tr>
</c:forEach>
</table>
<h2>合計</h2>
<fmt:formatNumber value="${sum}" pattern="###,###円"/>
</body>
</html>