package myClass;

import java.util.Scanner;

class SuperClass{
	int a, b; //필드
	
	public void setA(int a) {
		this.a =a; //필드 a값 설정 
	}
	public void setB(int b) {
		this.b =b; //필드 a값 설정 
	}
	public void sum() {
		System.out.println("덧셈 : " + (a+b));
	}
	public void substract() {
		System.out.println("뺄셈 : " + (a-b));
	}
}

class SubClass extends SuperClass{
	//어찌어찌 a값이 여기로 전달됨....
	public void mul() {
		System.out.println("곱셈 : " + a * b);
	}
	public void div() {
		System.out.println("나눗셈 : " + a / b);
	}
}


public class SuperSubEx02 {
	public static void main(String[] args) {
		System.out.println("2개의 정수 입력");
		
		Scanner sc = new Scanner(System.in);
		
		int kk = sc.nextInt();
		int yyy = sc.nextInt();
		
		SubClass sub = new SubClass();
		
		sub.setA(kk); //매개값 전달
		sub.setB(yyy); //매개값 전달
		
		sub.sum(); //덧셈
		sub.substract(); //뺄셈
		sub.mul(); //곱셈
		sub.div(); //나눗셈
		
		sc.close();
	}
}
