package myClass;

final class FinalTest { // 부모클래스가 될수 없다.
	final int MAX_SIZE = 10;  // 값을 변경할 수 없는 맴버변수(상수)
	
	final void getMaxSize() { // 오버라이딩 할 수 없는 메서드(변경불가)
		final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수(상수)
	}
	
}
