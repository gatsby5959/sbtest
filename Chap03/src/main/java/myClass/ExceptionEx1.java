package myClass;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try { //프로그램 처리
			// 예외가 발생할 가능성이 있는 문장들을 넣는다.
			try {
				//예외가 발생할 가능성이 있는 문장들을 넣는다.
			} catch (Exception e) {
				// Exception이 발생했을 경우, 이를 처리 하기 위한 문장을 넣는다.
			}
		} catch (Exception e) { //컴파일 에러 발생!!! 참조변수 e가 아닌 ex)e1으로 바꿔줘야 한다.
			// 런타임시 에러시 catch문으로 들어온다. 런타임 에러가 반나면 catch문(블럭)을 빠져나간다.
		} //try-catch의 끝
		
		
		
		//프로그램 예외처리 기본 코드
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} //try-catch끝
		
	} //main끝
}
