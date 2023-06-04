<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <title>암시적(묵시적?) 형변환</title>
</head>
<body>
	<h3>
	<%
	//double > float > long > int > short > byte 크기순서
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
		out.println("doubleNum2(바이트에서직접넘김) : " + doubleNum + " <hr/>");
	%>
	</h3>
</body>
</html>