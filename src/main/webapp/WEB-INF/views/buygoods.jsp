<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register/buy" method="post">
<label for="item1">商品1</label>
<input type="text" id="item1" name="item1"><br>
<label for="item2">商品2</label>
<input type="text" id="item2" name="item2"><br>
<label for="item3">商品3</label>
<input type="text" id="item3" name="item3"><br>
<input type="submit" name="購入">
</form>
</body>
</html>