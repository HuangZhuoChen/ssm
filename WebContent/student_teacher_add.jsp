<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/student/addAll.action">
		学生姓名：<input type="text" name="student.name" /><br /> 学生年龄：<input
			type="text" name="student.age" /><br />
		<hr />
		老师姓名：<input type="text" name="teacher.name" /><br /> 老师年龄：<input
			type="text" name="teacher.age" /><br /> <input type="submit"
			value="注册" /><br />
	</form>
	<br />
	<form action="${pageContext.request.contextPath}/student/deleteAll.action">
		<table border="1">
			<tr>
				<th>编号</th>
				<th>姓名</th>
			</tr>
			<tr>
				<td><input type="checkbox" name="ids" value="1"/></td>
				<td>张三</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="ids" value="2"/></td>
				<td>李四</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="ids" value="3"/></td>
				<td>王五</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="ids" value="4"/></td>
				<td>赵六</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
	
	<br />
	<form action="${pageContext.request.contextPath}/student/addAll.action" method="post">
		<table border="1">
			<tr>
				<td>姓名：<input type="text" name="list[0].name"/></td>
				<td>年龄：<input type="text" name="list[0].age"/></td>
			</tr>
			<tr>
				<td>姓名：<input type="text" name="list[1].name"/></td>
				<td>年龄：<input type="text" name="list[1].age"/></td>
			</tr>
			<tr>
				<td>姓名：<input type="text" name="list[2].name"/></td>
				<td>年龄：<input type="text" name="list[2].age"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
</body>
</html>