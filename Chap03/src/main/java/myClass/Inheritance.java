package myClass;

class Parent {
	int a = 10;
}

class Child extends Parent {
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}
/*
 * 위의 예제에서 int형 변수 a는 부모 클래스인 Parent 클래스에서만 선언되어 있습니다.
 * 따라서 지역 변수와 this 참조 변수 그리고 super 참조변수 모두 같은 값을 출력합니다.
 */
