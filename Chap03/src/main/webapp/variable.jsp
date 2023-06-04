<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>변수 관련 부분</title>
	</head>
	<body>
		<h3> <!-- 글자 크기 코드 -->
		<% // 자바 코드를 넣으려면 <% 를 넣어야 하나?
			int a = 3; // a의 값은 3
			int b;     // b는 어떤 값인가요?
			b = 2;     // b의 값은 2
			
			out.println(a+"<br/>"); // a의 값은 3, br태그는 한 줄 아래로...
			out.println(b+"<br/>"); // b의 값은 2, 자바의 System.out.println 대신 out을 사용합니다.
			
			a = b;    // a의 값은 2;
			b = 10;   // b의 값은 10;

			out.println(a+"<br/>"); // a의 값은 2
			out.println(b+"<br/>"); // b의 값은 10
		%>
		</h3>
	</body>
</html>