package myClass;

public class letterSender extends ContentSender {

	String content;
	
	public letterSender(String title, String nm, String content) {
		super(title, nm);
		this.content = content;
	}
	
	@Override
	public void sendMsg(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("제목      === "+ this.title);
		System.out.println("제목      === "+ this.nm);
		System.out.println("제목      === "+ this.content);
		System.out.println("받는 사람  === "+ recipient);
	}
}

