package myClass;

public class ExceptionEx4 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
			try {
				Exception e = new Exception("고의로 발생 시켰음");
				throw e; //예외를 발생시킴
//				throw new Exception("고의로 발생시켰음"); //위 두줄을 한줄로 줄여 쓸 수 있다
			} catch (Exception e) {
				 System.out.println("에러 메시지 : "+e.getMessage());
				e.printStackTrace();
			}//try-catch의 끝		
		System.out.println("프로그램이 정상 종료 되었습니다.");

	}
}
