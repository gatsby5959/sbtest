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
	String str1 = "String Test";//str1�� ��ġ��
	String str2 = "String Test";//�ڹٴ�...str2�� �����Ͱ� str1�� ������ str1�� ���� ��ġ�� ����
	String str3 = new String("String Test");//���� ��ġ �Ĺ���
	String str4 = new String("String Test");//�� ���� ��ġ �Ĺ���
	//��ġ�� �ƴ� �����͸� ���Ϸ��� �������� ��
	// �������� ��ġ�� �� ���ϰ� �����͸� ����
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
	// �������� ��ġ�� �� ���ϰ� �����͸� ����(String�϶�...)
	//�����͸� ���ϴ� �Լ���(equal��....)
	
	if(str1.equals(str3)){
		//�̹���� ���� ��� // ������ ��
		out.println("str1.equals(str3)");
	}
	
	if(str1 == str3){
		//�޸� ��ġ ��
		out.println("str1 == str3");
	}
%>
</body>
</html>