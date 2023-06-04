package myClass;

class Animal3{
	String name;
	
	public void name() {
		name = "동물";
		System.out.println("Animal = " + name);
	}
}

class Dog3 extends Animal3{ // Animal3클래스 상속
	public void name() {	//오버라이딩
		name = "강아지";
		System.out.println("Dog = " + name);
	}
	public void dMethod() {	//Dog메소드
		System.out.println("반려동물 ");
	}
}

class Lion3 extends Animal3{ // Animal3클래스 상속
	public void name() {	//오버라이딩
		name = "사자";
		System.out.println("Lion = " + name);
	}
}

class Yorkshire3 extends Dog3{ // Dog3클래스 상속
	public void name() {	//오버라이딩
		name = "요크셔테리어";
		System.out.println("Yorkshire = " + name);
	}
}




public class RefCasting {
	public static void main(String[] args) {
		Dog3 d1 = new Dog3();
		Animal3 a1 = (Animal3) d1; //업캐스팅 / 부모타입 생량가능(형변환)
		a1.name(); //출력 : 강아지
		// a1.dMethod(); //자식 클래스에만 있는 메소드로 부모 객체로 호출 불가
		
		Lion3 l1 = new Lion3();
		Animal3 a2 = l1; //업캐스팅
		a2.name(); //출력 : 사자
		
		Animal3 a3 = new Yorkshire3(); //업 캐스팅
		a3.name(); // 출력 요크셔테리어
	}
}

/*
 * 업 캐스팅은 자식 타입을 부모 타입으로 형 변환하는 것을 의미한다.
 * -형식 :Parent parent =(Parent) new Child(); (형변환시 부모 타입 생략가능)
 * -부모 타입으로 자식 타입의 멤버를 사용이 가능하다.(단, 부모가 갖고 있는 멤버에 한해서 사용)
 */
