<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
<title>메인(관리자)화면</title>
</head>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script>
//모든 레코드 가져오기
function getData(){
   $.ajax({
		//url은 /프로젝트명/servlet문서에서 정의한 @WebServlet의 urlpattern
        url: "index.do",
        dataType: "html", // 결과데이터 타입
        success: function (data) { 
     	   newTable = $(data).find("div.attach").html();
     	   console.log("js-table : "+newTable);
     	   $("#listTable").remove();//테이블의 첫행을 제외하고 모두 제거한다.
     	   $(".attach").after(newTable);//테이블의 첫번째 행 뒤에 table 추가한다.
        },
      	error: function (data) { alert(data+'=> 에러 발생'); }
    });
}//getData()함수끝 

function delProduct(id, name) {
    if(confirm("해당상품을 삭제하시겠습니까?\n해당 상품이름 : "+name)){
      	//document.listForm.action="/product/delete.do?productId="+id;
		//document.listForm.submit();
    	$.ajax({ 
	           url: "delete.do",
	           dataType: "text", // 결과데이터 타입 
	           data:"productId=" + id,
	           success: function (data) { 
	 			    getData();//삭제완료 후 다시 레코드 검색하기
	           },
	           error: function (data) { alert(data+'=> 에러 발생'); }
	     });
	}
}
</script>
<body>
<div align="center" class="body">
<h2>관리자화면</h2>
<form:form method="POST" action="index.do">
	<table border="1" width=700>
		<tr><td>상품명 검색</td><td colspan="3"><input type="text" name="srchProductName"/></td></tr>
		<tr><td>상품코드 검색</td><td colspan="3"><input type="text" name="srchProductCode"/></td></tr>
		<tr><td>상품분류</td>
		<td><select name="productCode">
				<option value="0">====대분류====</option><option value="1">Outer</option><option value="2">Dress</option><option value="3">Shose</option>
			</select>
		<td><select name="productCode">
				<option value="0">====중분류====</option><option value="1">Outer</option><option value="2">Dress</option><option value="3">Shose</option>
			</select>
		<td><select name="productCode">
				<option value="0">====소분류====</option><option value="1">Outer</option><option value="2">Dress</option><option value="3">Shose</option>
			</select>
		</td></tr>
		<tr><td>상품등록일</td>
		<td colspan="3"><input type="text" name="startDay"/>~<input type="text" name="endDay"/></td></tr>
	</table>
	<br><br>
	<input type="submit" value="검색"/>
	<br><br>
  	<a href="/regist/create.do">상품등록</a>
  	
  	
  	<div class="attach">
		<table border="1" id="listTable">
			<tr class="header">
				<th align="center" width="80">상품ID</th>
				<th align="center" width="100">브랜드</th>
				<th align="center" width="300">상품명</th>
				<th align="center" width="100">가격</th>
				<th align="center" width="50" colspan="2">편집</th>
			</tr>
			<c:forEach items="${productList}" var="product">
				<tr class="record">
					<td align="center">${product.productId}</td>
					<td align="center">${product.brand}</td>
					<td align="center"><a href="/product/detail.do?productId=${product.productId}">${product.productName}</a></td>
					<td align="center">${product.price}</td>
					<td align="center"><a href="/product/edit.do?productId=${product.productId}">수정</a></td>
					<td align="center"><a href="javascript:delProduct('${product.productId}','${product.productName}');">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</form:form>
</div>
	<form:form name="listForm"></form:form>
</body>
</html>