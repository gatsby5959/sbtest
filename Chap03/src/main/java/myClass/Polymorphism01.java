package myClass;

interface Animal1{
	public abstract void cry();
}

interface Pet1{
	public abstract void play();
}

class Cat1 implements Animal1, Pet1{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("냐옹냐옹");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("쥐 잡기 놀이하자~!");
	}
	
}

class Dog1 implements Animal1, Pet1{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("산책가자~!");
	}
	
}

public class Polymorphism01 {
	public static void main(String[] args) {
		Cat1 c = new Cat1();
		Dog1 d = new Dog1();
	
		c.cry();
		c.play();
		d.cry();
		d.play();

	}	
}
