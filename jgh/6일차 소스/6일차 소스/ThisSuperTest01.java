package myClass;

public class ThisSuperTest01 {

	int value = 10;
	
	public ThisSuperTest01(int value) {
		System.out.println(this.value);
	}
	
	public static void main(String[] args) {
		ThisSuperTest01 txt = new ThisSuperTest01(1);
	}
}
