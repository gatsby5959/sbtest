<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>char ������ Ÿ��</title>
</head>
<body>
	<%
		char a1 = 'a';
		char a2 = '\u0061';
		char a3 = 0x0061;
		char a4 = 97;
	
		out.print(a1);
		out.print("<hr/>");
		out.print(a2);
		out.print("<hr/>");
		out.print(a3);
		out.print("<hr/>");
		out.print(a4);
		out.print("<hr/>");
	%>
</body>
</html>