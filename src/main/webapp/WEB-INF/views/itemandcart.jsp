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
<c:forEach var="item" items="${items}">
<tr>
<td><c:out value="${item.name}"/> <fmt:formatNumber value="${item.price}" pattern="###,###円"/></td>
<td><form action="${pageContext.request.contextPath}/shoppingCart/inCart" method="post">
<input type="hidden" value="${item.name}" name="itemName">
<input type="submit" value="カートへ">
</form></td>
</tr>
</c:forEach>
</table>

</body>
</html>