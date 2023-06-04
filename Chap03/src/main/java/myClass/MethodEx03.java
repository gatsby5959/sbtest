package myClass;

public class MethodEx03 {
	
	public static void sum(int a) { //메소드 정의 int a 매개변수
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			sum += i;
			System.out.println("순번 i : " + i + "합계 : " + sum );
		}
		System.out.println("결과1 : " + sum);
	}
	
	public static void sum(int a, int b) { //void는 리턴이 없다
		int sum = 0;
		for(int i=a ; i <= b; i++) {
			sum += i;
			System.out.println("순번 i : " + i + " 합계 : " + sum);
		}
		
		System.out.println("결과2 : " + sum);
		
		String name = "백두산";
		
		if("백두산".equals(name)) {
			System.out.println("!!!!!!!!!이름 일치!!!!!!!");
			System.out.println("네임값은 "+ name + " 입니다." );
			
		}
	}
	
	public static void main(String[] args) {
		sum(15); // sum(int a) 호출 및 값 전달
		sum(5, 20); //sum(int a, b); 호출 및 값 전달
	}
}
