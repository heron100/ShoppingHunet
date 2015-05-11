<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
<title>상품 상세 화면</title>
</head>
<body>
<div align="center" class="body">
<h2>상품 상세 화면</h2>
<table>
	<tr>
		<td><img alt="상품이미지" src="img/${product.imageSystem}"></td>
		<td align="center">
		<table>
			<tr height="50">
				<td width="80">브랜드</td>
				<td width="160">${product.brand}</td>
			</tr>
			<tr height="50">
				<td width="80">상품명</td>
				<td width="160">${product.productName}</td>
			</tr>
			<tr height="50">
				<td width="80">가격</td>
				<td width="160">${product.price}원</td>
			</tr>
			<tr height="50">
				<td width="80">요약설명</td>
				<td width="160">${product.summary}</td>
			</tr>
			<tr height="50">
				<td width="80">상세설명</td>
				<td width="160">${product.detail}</td>
			</tr>
			<tr>
				<td colspan="2" align="center" width="240"><a href="/index/index.do">돌아가기</a></td>
			</tr>
		</table>
	</tr>
</table>
</div>
</body>
</html>