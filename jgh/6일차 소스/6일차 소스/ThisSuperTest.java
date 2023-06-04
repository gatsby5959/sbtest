package myClass;

public class ThisSuperTest {

	int value = 10;
	
	public ThisSuperTest(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		ThisSuperTest txt = new ThisSuperTest(1);
	}
}
