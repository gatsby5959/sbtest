<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>arithmetic.jsp ��� ������</title>
</head>
<body>
	<h3>
	<%
		int a = 10;
		int b = 3;
		int c = a+b; //���⼭ �����
		double d = a;
		out.println("a�� �� : " + a + "<br/>");
		out.println("b�� �� : " + b + "<hr/>");
		
		out.println(a+ " + " + b + " = " + c);//������ �����
		out.println("<br/>");
		
		out.println(a+ " - " + b + " = " + (a - b));//���⼭ �����
		out.println("<br/>");
		
		out.println(a+ " * " + b + " = " + (a * b));
		out.println("<br/>");
		
		out.println(a+ " / " + b + " = " + (a / b));
		out.println("<br/>");
		
		out.println(a+ " % " + b + " = " + (a % b)); //�������� ���
		out.println("<br/>");
	%>
	</h3>
</body>
</html>