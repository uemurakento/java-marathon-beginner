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
<h1>合計金額</h1>
<h2>■税抜き価格</h2>
<fmt:formatNumber value="${sum}" pattern="###,###円"/>
<h2>■税込み価格</h2>
<fmt:formatNumber value="${tax}" pattern="###,###円"/>
</body>
</html>