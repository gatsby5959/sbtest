package myClass;

public class MethodEx02 {
	public static int div() { // 메소드 정의
		int a = 10, b=5;
		int result = a/b;
		int result2 = a*b;
		return result; // 호출한 곳으로 값 반환
//		return result2; // 리턴은 무조건 1개여야함
	}
	
	public static void main(String[] args) {
		System.out.println(div());
	}
}
