package myClass;

public class StaticTest01 {
	
	static int width = 20; // 클래스 변수 - 동일한 클래스의 모든 객체들에 의해서 공유됨
	static int height = 100; // 클래스 변수 - 동일한 클래스의 모든 객체들에 의해서 공유됨
	//int instanceVar = 28;     // 인스턴스 변수 - 클래스 변수와 달리 공유되지 않음
    
    static {
        //static 변수의 복잡한 초기화 수행 (초기화 블록)
    }
    
    static int max(int a, int b) { //클래스 메서드
        return a > b ? a : b;
    }
}
