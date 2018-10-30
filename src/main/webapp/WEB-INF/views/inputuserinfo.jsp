<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userInfo/output" method="post">
<label for="name">名前：	</label>
<input type="text" id="name" name="name"><br>
<label for="age">年齢：	</label>
<input type="text" id="age" name="age"><br>
<label for="address">住所：	</label>
<input type="text" id="address" name="address"><br>
<input type="submit" name="送信">
</form>
</body>
</html>