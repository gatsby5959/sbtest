<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<title>compare.jsp ����������</title>
</head>
<body>
<%
	int a = 10;
	int b = 16;
	
	out.print("a : "+ a + ", b : " + b + "<br/>");
	
	out.print("a > b : "	+ (a > b)  + "<br/>");
	out.print("a >= b : "	+ (a >= b) + "<br/>");
	out.print("a < b : "	+ (a < b)  + "<br/>");
	out.print("a <= b : "	+ (a <= b) + "<br/>");
	out.print("a == b : "	+ (a == b) + "<br/>");
	out.print("a != b : "	+ (a != b) + "<br/>");
%>

</body>
</html>