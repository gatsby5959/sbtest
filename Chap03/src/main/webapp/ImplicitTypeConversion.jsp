<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>�Ͻ���(������?) ����ȯ</title>
</head>
<body>
	<h3>
	<%
	//double > float > long > int > short > byte ũ�����
		byte byteNum = 100;
		out.println("byte : " + byteNum + " <hr/>");
		
		short shortNum = byteNum;
		out.println("shortNum : " + shortNum + " <hr/>");
		int intNum = shortNum;
		out.println("intNum : " + intNum + " <hr/>");
		long longNum = intNum;
		out.println("longNum : " + longNum + " <hr/>");
		float floatNum = longNum;
		out.println("floatNum : " + floatNum + " <hr/>");
		double doubleNum = floatNum;
		out.println("doubleNum : " + doubleNum + " <hr/>");
		
		double doubleNum2 = byteNum;
		out.println("doubleNum2(����Ʈ���������ѱ�) : " + doubleNum + " <hr/>");
	%>
	</h3>
</body>
</html>