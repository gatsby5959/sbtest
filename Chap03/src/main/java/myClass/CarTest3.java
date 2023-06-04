package myClass;

class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
		this("write", "auto", 4); //Car2(String color, String gearType, int door)를 10출 호출
	}

	Car2(Car2 c) {	//인스턴스 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2(); 
		Car2 c2 = new Car2(c1); 
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door" + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door" + c2.door);

		c1.door = 100;
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door" + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door" + c2.door);
		
		/* 인스턴스 C2는 C1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만, 서로 독립적으로 메모리공간에 존재하는 별도의 인스턴스이므로
		 * C1의 값들이 변경되어도 C2는 영향을 받지 않는다.
		 */
	}
}
