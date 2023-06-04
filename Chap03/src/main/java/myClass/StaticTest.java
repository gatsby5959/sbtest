package myClass;

public class StaticTest {
	static int classVar = 10; //클래스 변수 동일한 클래스의 몯ㄴ객체들에 의해서 공유됨 스태틱변수
	int instanceVar = 28; //인스턴스변수 클래스 변수와 달리 공유되지 않음 논 스태택 변수 메인메소드안에서도 못씀 
	
	public static void main(String[] args) {
		int localVar = -100; // 지역변수 메소드 블럭내에서만 사용가능
		System.out.println("localVar : " + localVar);
		System.out.println("classVar : " + classVar);
//		System.out.println("instanceVar :" + instance Var);
		
		if(localVar == -100) {
			int localVar1 = 100; //지역변수 메소드 블력 내에서만 사요가능
			System.out.println("localVar1 : " + localVar1);
		}
		
		//System.out.println("localVar1 : " + localVar1);
	}
}
