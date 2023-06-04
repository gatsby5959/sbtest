package myClass;

public class InitTest {
	int x;	//인스턴스 변수
	int y = x;  // 인스턴스 변수
	
	/*
	 * 인스턴스 변수는 x는 초기화 해주지 않아도 자동적으로 int형의
	 * 기본값은 int 0 으로 초기화 되므로 int y = x; 와 같이 할 수 있다.
	 * x의 값이 0 이므로 y역시 0 이 저장된다.
	 */
	
	void method1() {
		int i; //지역변수
		int j = i; //컴파일 에러 지역변수를 초기화 하지 않고 사용했음.
		/*
		 * Method1()의 지역변수 i는 자동적으로 초기화되지 않으므로, 초기화 되지 않은 상태에서
		 * 변수 j 를 초기화 하는데 사용될 수 없기 때문에 컴파일 에러가 발생한다.
		 */
	}
		
	public static void main(String[] args) {
		
	}
}
