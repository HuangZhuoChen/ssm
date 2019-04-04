<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/student/add.action">
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"/><br/>
		选择班级:
		<select name="banji.id">
			<c:forEach items="${list}" var="banji">
				<option value="${banji.id}">${banji.name}</option>
			</c:forEach>
		</select><br/>
		<input type="submit" value="注册"/><br/>
	</form>
</body>
</html>