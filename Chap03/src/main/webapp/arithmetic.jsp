<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>arithmetic.jsp 산술 연산자</title>
</head>
<body>
	<h3>
	<%
		int a = 10;
		int b = 3;
		int c = a+b; //여기서 계산방식
		double d = a;
		out.println("a의 값 : " + a + "<br/>");
		out.println("b의 값 : " + b + "<hr/>");
		
		out.println(a+ " + " + b + " = " + c);//위에서 계산방식
		out.println("<br/>");
		
		out.println(a+ " - " + b + " = " + (a - b));//여기서 계산방식
		out.println("<br/>");
		
		out.println(a+ " * " + b + " = " + (a * b));
		out.println("<br/>");
		
		out.println(a+ " / " + b + " = " + (a / b));
		out.println("<br/>");
		
		out.println(a+ " % " + b + " = " + (a % b)); //나머지값 출력
		out.println("<br/>");
	%>
	</h3>
</body>
</html>