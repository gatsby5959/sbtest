package myClass;


class SmartPhone{ //슈퍼 클래스
	public void name() {
		System.out.println("스마트폰");
	}
}

class Apple extends SmartPhone{ // 서브 클래스
	public void name() {
		System.out.println("회사명 : 애플");
	}
	
	public void iPhone() {
		System.out.println("모델 : 아이폰");
	}
}

class Samsung extends SmartPhone{ // 서브 클래스
	public void name() {
		System.out.println("회사명 : 삼성");
	}
	
	public void galaxy() {
		System.out.println("모델 : 갤럭시");
	}
}



public class RefCastingEx02 {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		SmartPhone sp1 = a1;	//업캐스팅
		sp1.name();
//		sp1.iPhone(); //자식 메소드 사용 불가
		a1=(Apple)sp1;
		a1.iPhone();
		
		SmartPhone sp2 = new Samsung();
		sp2.name();
//		sp2.galaxy(); 자식 메소드 사용불가
		Samsung s1 = (Samsung)sp2; //다운케스팅
		s1.galaxy();
		
		Apple.a2 = (Apple) new SmartPhone(); //다운캐스팅
		a2.name(); //예외발생 (다운케스팅을 하기 위해서는 업 캐스팅이 선행되어야 함)
	}

}
