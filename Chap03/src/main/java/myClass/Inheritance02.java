package myClass;

class Parent2 {
	int a;
	Parent2(){
		a=10;
	}
	Parent2(int n){
		a=n;
	}
	
}

class Child2 extends Parent2 {
	int b;
	Child2(){
		//super(); //자동으로 컴파일 되어서 호출
//		super(40); //1번
		b=20;
	}
	void display() {
		System.out.println(a);		
		System.out.println(b);		
	}
}

public class Inheritance02 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.display();
	}
}
/*
 * 위의 예제르 그냥 실행화면, 자바 컴파일러는 주석 처리된 1번 라인에 자동으로 super();
 * 구문을 삽입할 것입니다. 따라서 변수 a는 10으로 초기화 됩니다.
 * 하지만 1번라인의 주석 처리를 해제하고 실행하면, 부모 클래스인 Parent 클래스는 두 번째 생성자에 의해 초기화 될 것입니다.
 * 따라서 변수 a는 40으로 초기화됩니
 */
