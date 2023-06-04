package newClass;

import youClass3.MyClass;

public class AccessMain3 extends MyClass  { //상속해도 아래에서 안됨...
	public static void main(String[] args) {
		MyClass myclass = new MyClass(); //Myclass는 접근제어자가 public이라서 에러 안남 
		myclass.a = "a"; // a는 접근제어자가 default라서 에러
	}
}
