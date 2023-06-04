package myClass;

public class StaticTest {
	
	static int classVar = 10; // 클래스 변수 - 동일한 클래스의 모든 객체들에 의해서 공유됨
	int instanceVar = 28;     // 인스턴스 변수 - 클래스 변수와 달리 공유되지 않음
	
	public static void main(String args[]) {
		int localVar = - 100; //지역 변수 (메소드 블럭 내에서만 사용가능)
		System.out.println("localVar : " + localVar);
		System.out.println("classVar : " + classVar);
		//System.out.println("instanceVar : " + instanceVar);
		
		if(localVar == -100) {
			int localVar1 = 100; //지역 변수 (메소드 블럭 내에서만 사용가능)
			System.out.println("localVar1 : " + localVar1);
		}
		
		//System.out.println("localVar1 : " + localVar1);
			
	}
}
