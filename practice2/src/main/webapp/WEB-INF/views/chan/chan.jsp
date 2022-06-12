<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chan</title>
</head>
<body>
	<div align="center">
		<div><h1>!!!!!!이규찬 클라우드 연동 연습 페이지!!!!!!!!!!!!!!!</h1></div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th width="100">ID</th>
						<th width="150">이름</th>
						<th width="300">한마디</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.id }</td>
						<td>${list.name }</td>
						<td>${list.intro }</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>