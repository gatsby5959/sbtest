<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>increaseDecrease.jsp ����������</title>
</head>
<body>
<%
	int a = 10;

	out.print("���� a�� �� : " + a + "<hr/>" );
	out.print("[++a] ��� : ");
	out.print(++a);
	
	out.print("<br/>" );
	out.print("���� a�� �� : " + a + "<hr/>" );
	out.print("[a++] ��� : ");
	out.print(a++);
	
	out.print("<br/>" );
	out.print("���� a�� �� : " + a + "<hr/>" );
	out.print("[--a] ��� : ");
	out.print(--a);
	
	out.print("<br/>" );
	out.print("���� a�� �� : " + a + "<hr/>" );
	out.print("[a--] ��� : ");
	out.print(a--);
	
	out.print("<br/>");
	out.print("���� a�� �� : " + a + "<hr/>" );
%>

</body>
</html>