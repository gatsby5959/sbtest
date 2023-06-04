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
		String str1= "String Method!";
		String str2= "String method!";
	%>
	<h3>
		str1.length() : <%=str1.length() %><br/>
		str2.length() : <%=str2.length() %><br/>
	</h3><hr/>
	<h3>
		str1.charAt(0) : <%=str1.charAt(0) %><br/>
		str2.charAt(7) : <%=str2.charAt(7) %><br/>
	</h3><hr/>
	<h3>
		str1.indexOf("Method") : <%=str1.indexOf("Method") %><br/> <!-- 길이 -->
		str2.indexOf("Method") : <%=str2.indexOf("Method") %><br/> <!-- 길이 -->
		str1.indexOf("Method",4) : <%=str1.indexOf("Method",4) %><br/>
		str2.indexOf("Method",10) : <%=str2.indexOf("Method",10) %><br/>
	</h3>
	<h3>
		str1.charAt(0) : <%=str1.charAt(0) %><br/>
		str2.charAt(7) : <%=str2.charAt(7) %>
	</h3><hr/>
	<h3>
		str1.indexOf("Method") : <%=str1.indexOf("Method") %><br/>
		str2.indexOf("Method") : <%=str2.indexOf("Method") %><br/>
		str1.indexOf("Method", 4) : <%=str1.indexOf("Method", 4) %><br/>
		str2.indexOf("Method", 10) : <%=str2.indexOf("method", 10) %><br/>
		str1.indexOf('M',1) : <%=str1.indexOf('M',1) %><br/>
		str2.indexOf('M',1) : <%=str2.indexOf('M',1) %><br/>
	</h3><hr/>
	<h3>
		str1.substring(7) : <%=str1.substring(7) %><br/>
		str2.substring(0,6) : <%=str2.substring(0,6) %><br/>
	</h3><hr/>
	<h3>
		str1.equals(str2) : <%=str1.equals(str2) %><br/>
		str1.compareTo(str2) : <%=str1.compareTo(str2) %><br/> <!-- 잘안씀 -->
		str1.substring(0,6).equals(str2.substring(0,6)) : <%=str1.substring(0,6).equals(str2.substring(0,6))%><br/>
		str1.substring(0,6).compareTo(str2.substring(0,6)) : <%=str1.substring(0,6).compareTo(str2.substring(0,6))%><br/>
	</h3>
</body>
</html>