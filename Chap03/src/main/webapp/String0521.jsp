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
	String str1 = "String Test";//str1은 위치값
	String str2 = "String Test";//자바는...str2의 데이터가 str1과 같으면 str1과 같은 위치값 공유
	String str3 = new String("String Test");//새로 위치 파버림
	String str4 = new String("String Test");//또 새로 위치 파버림
	//위치가 아닌 데이터를 비교하려면 이퀄스를 씀
	// 이퀄스는 위치는 비교 안하고 데이터만 비교함
	out.println("str1 : " + str1 + "<br/>");
	out.println("str2 : " + str2 + "<br/>");
	out.println("str3 : " + str3 + "<br/>");
	out.println("str4 : " + str4 + "<hr/>");
	out.println("str4 : " + str4 + "<hr/>");
	
	out.println("str1 == str2 " + (str1 == str2) + "<br/>");
	out.println("str1 == str3 " + (str1 == str3) + "<br/>");
	out.println("str3 == str4 " + (str3 == str4) + "<hr/>");
	
	out.println("str1.equals(str2) " + str1.equals(str2) + "<br/>");
	out.println("str1.equals(str3) " + str1.equals(str3) + "<br/>");
	out.println("str3.equals(str4) " + str3.equals(str4) + "<br/>");
	// 이퀄스는 위치는 비교 안하고 데이터만 비교함(String일때...)
	//데이터만 비교하는 함수임(equal는....)
	
	if(str1.equals(str3)){
		//이방식을 많이 사용 // 데이터 비교
		out.println("str1.equals(str3)");
	}
	
	if(str1 == str3){
		//메모리 위치 비교
		out.println("str1 == str3");
	}
%>
</body>
</html>