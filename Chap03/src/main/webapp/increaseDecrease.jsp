<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>increaseDecrease.jsp 증감연산자</title>
</head>
<body>
<%
	int a = 10;

	out.print("현재 a의 값 : " + a + "<hr/>" );
	out.print("[++a] 출력 : ");
	out.print(++a);
	
	out.print("<br/>" );
	out.print("현재 a의 값 : " + a + "<hr/>" );
	out.print("[a++] 출력 : ");
	out.print(a++);
	
	out.print("<br/>" );
	out.print("현재 a의 값 : " + a + "<hr/>" );
	out.print("[--a] 출력 : ");
	out.print(--a);
	
	out.print("<br/>" );
	out.print("현재 a의 값 : " + a + "<hr/>" );
	out.print("[a--] 출력 : ");
	out.print(a--);
	
	out.print("<br/>");
	out.print("현재 a의 값 : " + a + "<hr/>" );
%>

</body>
</html>