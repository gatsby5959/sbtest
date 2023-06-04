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
			out.print("컨틴뉴문 만남 반복 뛰어넘음(그냥위로 다시 올라감) 브레이크는 그냥 포문을 완전 나감 <br/>");
			continue;
		}

		out.print("2곱하기" + i + "은");
		out.print(2 * i);
		out.print("<br/>");
	}
	%>
</body>
</html>