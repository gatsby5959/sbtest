package myClass;

class Parent1 {
	int a = 10;
}

class Child1 extends Parent {
	int a = 20;
	void display() {
		System.out.println(a);		//Child1 class 기준 출력 20 this. 생략
		System.out.println(this.a); //Child1 class 기준 출력
		System.out.println(super.a);//Parent1 class 기준 출력
	}
}

public class Inheritance01 {

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.display();
	}
}
/*
 * 위의 예제에서 int형 변수 a는 부모 클래스인 Parent 클래스에서만 선언되어 있습니다.
 * 따라서 지역 변수와 this 참조 변수 그리고 super 참조변수 모두 같은 값을 출력합니다.
 */
