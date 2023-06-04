package myClass;

class Woman{ //부모클래스
	public String name;
	public int age;

	//info 메소드
	public void info() {
		System.out.println("여자 이름은 "+name+ ",나이는 "+age +"살입니다.");
	}
}

class Job extends Woman{ // Woman클래스(부모클래스)를 상속받음
	
	String job;
	
	public void info() {
		super.info();//부모꺼 실행하는듯
		System.out.println("여자의 직업은 "+job+"입니다.");
	}
	
}

public class OverTest{
	public static void main(String[] args) {
		
		//r객체 생성
		Job job = new Job();
		
		//변수 설정
		job.name = "유리";
		job.age = 30;
		job.job = "프로그래머";
		
		//호출
		job.info();
	}
}

