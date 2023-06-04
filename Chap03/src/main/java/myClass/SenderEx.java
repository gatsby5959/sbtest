package myClass;

public class SenderEx {
	public static void main(String[] args) {
		//추상클래스는 인스턴스를 정대로 생성하지 않는다
		//ContentSender contentSender = new ContentSender(); XXX
		//ContentSender 가 추상클래스라서 추상메서드를 자손에서 오버라이딩 해주어야 인스터스가 생성된다.
		
		ContentSender cs1 = new letterSender("SMS문자", "서수진", "4달라");
		cs1.sendMsg("슈화");
		
		System.out.println();
		
		ContentSender ls = new letterSender("SMS문자", "김민희", "3달라");
		ls.sendMsg("조미연");
		
		System.out.println();
		
		ContentSender cs2 = new letterSender("카톡", "송우기", "10달라");
		cs2.sendMsg("전소연");
		
	}
}
