<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/nameReceive/output" method="post">
<label for="name">名前：</label>
<input type="text" id="name" name="name"><br>
<input type="submit" name="送信">
</form>

</body>
</html>