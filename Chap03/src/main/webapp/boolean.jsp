<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>���� ������ Ÿ��</title>
</head>
<body>
	<h3>
	<%
		int num1 = 3;
		int num2 = 10;
		
		boolean bool;
		
		out.print("num1�� " + num1+" <hr>");
		out.print("num2�� " + num2+" <hr>");
		bool = (num1<num2);	//num1 = 3, num2 = 10 --> 3��10���� ������ ��, true
		
		out.print(bool+"<hr/>");
		
		bool = (num1>num2);
		out.print(bool+"<hr/>");
	%>
	</h3>
</body>
</html>