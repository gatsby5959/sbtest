package myClass;

import java.util.Scanner;

public class Iftest230604 {
	public static void main(String[] args) {
		System.out.println("생년월일을 입력하세요 ex)19801215");
		int inta = 19110118;
		
		Scanner sc = new Scanner(System.in);
//		if() {
		inta = sc.nextInt();
//		{
//		sta = sc.next();
//		System.out.println("생년월일을 입력하세요");
		if(inta==19110118) {
			System.out.println("숫자값  19110118가 생일이 맞습니다.");
		}else {
			System.out.println("년도 생일이 틀렸습니다.");
		}
		
		
		String sta = "19110118";
		if(sta.equals("19110118")) {
			System.out.println("텍스트값  19110118가 생일이 맞습니다.");
		}else {
			System.out.println("년도 생일이 틀렸습니다.");
		}
	}
}
