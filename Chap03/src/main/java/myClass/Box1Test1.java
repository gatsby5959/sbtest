package myClass;

class Box1 {
	int width;
	int height;
	int depth;
}

public class Box1Test1 {
	public static void main(String[] args) {
		Box1 mybox1; // Box1클래스의 mybox1객체 생성
		mybox1 = new Box1(); // 객체생성

		Box1 mybox2 = new Box1(); // Box1클래스로부터 (2번째의 Mybox2)객체생성 위에에 것이랑 서로 위치값 다름, so 새 객체임

		int vol1, vol2;

		mybox1.width = 78; // 각 객체의 속성값을 직접지정
		mybox1.height = 145;
		mybox1.depth = 87;

		mybox2.width = 48;
		mybox2.height = 45;
		mybox2.depth = 137;

		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("첫 번째 박스의 부피는 " + vol1 + "입니다.");

		vol2 = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("첫 번째 박스의 부피는 " + vol2 + "입니다.");
	}
}
