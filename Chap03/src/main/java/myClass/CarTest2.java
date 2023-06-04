package myClass;

class Car1 {
	String color;
	String gearType;
	int door;

	Car1() {
		this("write", "auto", 4); //Car1(String color, String gearType, int door) 를 20줄 호출
	}

	Car1(String color) {
		this(color, "auto", 4);
	}

	Car1(String color, String gearType) {
		this(color, gearType, 4);
	}

	Car1(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
/*
 * 작성일자 23 05 27
 * 작성자  전경환
 * 
 */

public class CarTest2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1(); //8줄 호출
		Car1 c2 = new Car1("blue"); //12줄 호출
		Car1 c3 = new Car1("블렉렐개렉", "auto1"); //16줄 호출
		Car1 toyota86 = new Car1("빨강", "수동변속", 2); //20줄 호출

		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door" + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door" + c2.door);
		System.out.println("c3의 color = " + c3.color + ", gearType = " + c3.gearType + ", door" + c3.door);
		System.out.println("toyota86의 color = " + toyota86.color + ", gearType = " + toyota86.gearType + ", door" + toyota86.door);
	}
}
