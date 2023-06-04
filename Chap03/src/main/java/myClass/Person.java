package myClass;

//접근을 위해 setter와 getter라는 장치를 만들어 접근가능

public class Person {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	/* 아이디값 리턴*/
	public void setId(int id) {
		this.id = id;
	}
	
	//
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
