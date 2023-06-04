package myClass;

public class OverloadingEx01 {

	// 메소드 정의 int a, b매개변수(parameter)
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// 메소드 정의 double a, b매개변수(parameter)
	public void add(double a, double b) {
		System.out.println(a + b);
	}

	// 메소드 정의 int a, double b매개변수(parameter)
	public void add(int a, double b) {
		System.out.println(a + b);
	}

	
	
	public static void main(String[] args) {
		OverloadingEx01 ol = new OverloadingEx01();

		ol.add(1, 2);
		ol.add(2.5, 8);
		ol.add(3, 5.5);
	}
}
