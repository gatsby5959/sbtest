<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	for (int i = 1; i <= 9; i++) {
		if (i == 5) {
			out.print("��ƾ���� ���� �ݺ� �پ����(�׳����� �ٽ� �ö�) �극��ũ�� �׳� ������ ���� ���� <br/>");
			continue;
		}

		out.print("2���ϱ�" + i + "��");
		out.print(2 * i);
		out.print("<br/>");
	}
	%>
</body>
</html>