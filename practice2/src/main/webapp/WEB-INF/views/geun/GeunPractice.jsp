<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일요일 좋아</title>
</head>
<body>
	<div>
		<h1>일요일에 너무 덥다!!!!</h1>
	</div>

	<table border="1">
		<thead>
			<tr>
				<th width="400">title</th>
				<th width="400">CONTENT</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td width="400">${list.title}</td>
					<td width="400">${list.content}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>