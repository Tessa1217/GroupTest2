<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jong Page 입니다. 핳ㅎ하ㅏ하</title>
</head>
<body>
<h1>종혁이 페이지입니다 하핳ㅎ하하하ㅏ</h1>
<div>
<table border=1>
	<caption>우리 조 이름 이다!!!</caption>
		<thead>
			<tr>
				<th width="100">글번호</th>
				<th width="150">작성자</th>
				<th width="250">가입날짜</th>
				<th width="100">나이</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="l">
				<tr>
					<td>${l.id}</td>
					<td>${l.name}</td>
					<td><fmt:formatDate value="${l.sdate}" pattern="yyyy.MM.dd" /></td>
					<td>${l.age}</td>
				</tr>
			
			</c:forEach>
		
		</tbody>
		
</table>
</div>
</body>
</html>