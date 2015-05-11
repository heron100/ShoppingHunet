<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
<title>상품등록</title>
<script type="text/javascript" src ="/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="/ckfinder/ckfinder.js"></script>
</head>
<body>
<div align="center" class="body">
<h2>상품등록</h2>
<form:form modelAttribute="product" method="post" enctype="multipart/form-data" action="regist.do">
	<table>
		<tr height="40px">
			<td>상품명</td>
			<td><form:input size="80" path="productName"/></td>
			<td><font color="red"><form:errors path="productName"/></font></td>
		</tr>
		<tr height="40px">
			<td>영문상품명</td>
			<td><form:input size="80" path="productNameEng"/></td>
			<td><font color="red"><form:errors path="productNameEng"/></font></td>
		</tr>
		<tr height="40px">
			<td>브랜드</td>
			<td><form:input size="80" path="brand"/></td>
			<td><font color="red"><form:errors path="brand"/></font></td>
		</tr>
		<tr height="40px">
			<td>상품코드</td>
			<td><form:input size="80" path="productCode"/></td>
			<td><font color="red"><form:errors path="productCode"/></font></td>
		</tr>
		<tr height="40px">
			<td>가격</td>
			<td><form:input size="10" path="price"/>&nbsp;원</td>
			<td><font color="red"><form:errors path="price"/></font></td>
		</tr>
		<tr height="40px">
			<td>상품이미지</td>
			<td><input type="file" name="productImg"/></td>
		</tr>
		<tr height="40px">
			<td>할인률</td>
			<td><form:input size="10" path="discount"/>%</td>
			<td><font color="red"><form:errors path="discount"/></font></td>
		</tr>
		<tr height="40px">
			<td>적립금</td>
			<td><form:input size="10" path="pointRate"/>%</td>
			<td><font color="red"><form:errors path="pointRate"/></font></td>
		</tr>
		<tr height="40px">
			<td>상품 요약</td>
			<td><form:textarea rows="10" cols="120" path="summary"/></td>
			<td><font color="red"><form:errors path="summary"/></font></td>
		</tr>
		<tr height="40px">
			<td>상품 상세</td>
			<td><form:textarea id="editor1" path="detail"/></td>
			<td><font color="red"><form:errors path="detail"/></font></td>
		</tr>
		<tr height="40px">
			<td>모바일 상세</td>
			<td><form:textarea id="editor2" path="mobileDetail"/></td>
			<td><font color="red"><form:errors path="mobileDetail"/></font></td>
		</tr>
		<tr height="40px">
			<td>진열상태</td>
			<td><form:radiobutton path="stateId" value="0"/>진열안함&nbsp;
				<form:radiobutton path="stateId" value="1"/>진열함</td>
		</tr>
		<tr height="40px">
			<td>옵션여부</td>
			<td><form:radiobutton path="hasOption" value="0"/>없음&nbsp;
				<form:radiobutton path="hasOption" value="1"/>있음</td>
		</tr>
		<tr height="40px">
			<td>재고</td>
			<td><form:input size="10" path="storage"/></td>
			<td><font color="red"><form:errors path="storage"/></font></td>
		</tr>
	</table>
	<br>
	<input type="submit" value="등록"/><input type="reset" value="리셋"/><br>
	<br>
	<a href="/product/index.do">돌아가기</a>
</form:form>
<script>
CKEDITOR.replace('editor1');
CKEDITOR.replace('editor2');
</script>
</div>
</body>
</html>