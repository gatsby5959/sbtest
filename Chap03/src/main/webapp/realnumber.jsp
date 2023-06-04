<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>실수형 데이터 타입</title>
</head>
<body>
	<h3>
	<%
		double doubleNum1 = 3.14;
		double doubleNum2 = 365;
		double doubleNum3 = 1.0;
		double doubleNum4 = .5;
		double doubleNum5 = 92.;
		double doubleNum6 = 92.111111111111111111111111111111111;
		
		out.print(doubleNum1 + "<br/>");
		out.print(doubleNum2 + "<br/>");
		out.print(doubleNum3 + "<br/>");
		out.print(doubleNum4 + "<br/>");
		out.print(doubleNum5 + "<hr/>");
		out.print(doubleNum6 + "<hr/>");
		
		float floatNum1 = 3.14f;
		float floatNum2 = 3.14F; //무조건 f넣어야함
		//float floatNum2 = 3.14; f없이는 안됨 더블보다 작은 주제에 f까지 써야함 불편함
		out.print(floatNum1 + "<br/>");
		out.print(floatNum2 + "<hr/>");
	%>
	</h3>
</body>
</html>