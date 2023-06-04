package myClass;

public class MethodEx01 {

	public static void sum() { // 메소드 정의
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
//			System.out.println(sum);
		}
		
		System.out.println("포문탈출"+sum);

		return;
	}

	public static void main(String[] args) {
		sum();
		sum();
		sum();
	}

}
