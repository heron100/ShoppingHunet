<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
<title>메인화면</title>
</head>
<body>
<div align="center" class="body">
<h2>Main화면-GitTEST(20150519)s</h2>
<form:form method="POST" action="index.do">
	상품명 검색<input type="text" name="productName"/><input type="submit" value="검색"/>
	<table border="1">
		<tr class="header">
			<th align="center" width="80">상품ID</th>
			<th align="center" width="100">브랜드</th>
			<th align="center" width="300">상품명</th>
			<th align="center" width="100">가격</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr class="record">
				<td align="center">${product.productId}</td>
				<td align="center">${product.brand}</td>
				<td align="center"><a href="/detail/detail.do?productId=${product.productId}">${product.productName}</a></td>
				<td align="center">${product.price}</td>
			</tr>
		</c:forEach>
	</table>
</form:form>
</div>
</body>
</html>