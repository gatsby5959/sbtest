<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ���� �κ�</title>
	</head>
	<body>
		<h3> <!-- ���� ũ�� �ڵ� -->
		<% // �ڹ� �ڵ带 �������� <% �� �־�� �ϳ�?
			int a = 3; // a�� ���� 3
			int b;     // b�� � ���ΰ���?
			b = 2;     // b�� ���� 2
			
			out.println(a+"<br/>"); // a�� ���� 3, br�±״� �� �� �Ʒ���...
			out.println(b+"<br/>"); // b�� ���� 2, �ڹ��� System.out.println ��� out�� ����մϴ�.
			
			a = b;    // a�� ���� 2;
			b = 10;   // b�� ���� 10;

			out.println(a+"<br/>"); // a�� ���� 2
			out.println(b+"<br/>"); // b�� ���� 10
		%>
		</h3>
	</body>
</html>