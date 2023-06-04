package myClass;

class A {
	String aField = "클래스 A 필드";

	public void aMethod() {
		System.out.println(aField);
//			System.out.println("A : " + bField); //컴파일 에러 자식필드 사용불가
	}
}

class B extends A { //A클래스 상속함 상속받음
	String bField = "클래스 B 필드";

	public void bMethod() {
		System.out.println(aField);
		System.out.println(bField);
//			System.out.println("B : " + cField); //컴파일 에러 자식필드 사용불가
	}
}

class C extends B { //B클래스 상속함 상속받음
	String cField = "클래스 C 필드";

	public void cMethod() {
		System.out.println(aField);
		System.out.println(bField);
		System.out.println(cField);
	}
}


public class SuperSubEx01 {
	public static void main(String[] args) {

		System.out.println("-----------A-------------");
		A a = new A();
		a.aMethod(); //본인 메소드 사용
//		a.bMethod(); //A(부모) 객체로 B(자식) 메소드 접근 불가
		
		System.out.println("-----------A------------");
		System.out.println("-----------B------------");
	
		B b = new B();
		b.aMethod(); //부모 메소드 사용 (A클래스를 상속받아서 표시)
		b.bMethod(); //본인 메소드 사용
		// b.cMethod(); //B(부모) 객체로 C(자식) 메소드 접근 불가
		System.out.println("--------B---------");
		System.out.println("--------C---------");
		
		C c = new C();
		c.aMethod(); //조부모 메소드 사용
		c.bMethod(); //부모 메소드 사용
		c.cMethod(); //본인 메소드 사용
		System.out.println("-------C-------");
	}
}
