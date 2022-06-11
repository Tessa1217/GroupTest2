<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<caption>우리 조</caption>
			<thead>
				<tr>
					<th>아이디</th>
					<th>비번</th>
					<th>이름</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="member">
					<tr>
						<td>${member.id}</td>
						<td>${member.password}</td>
						<td>${member.name}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>