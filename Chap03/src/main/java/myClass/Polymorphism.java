package myClass;

interface Animal{
	public abstract void cry();
}

class Cat implements Animal{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("냐옹냐옹");
	}
	
}

class Dog implements Animal{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

public class Polymorphism {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
	
		c.cry();
		d.cry();

	}	
}
