package myClass;

import java.util.Scanner;

public class Iftest230604 {
	public static void main(String[] args) {
		int inta = 19110118;
		String sta = "19110118";
		Scanner sc = new Scanner(System.in);
//		System.out.println("생년월일을 입력하세요");
		if(inta==19110118) {
			System.out.println("19110118가 생일이 맞습니다.");
		}else {
			System.out.println("년도 생일이 늘렸습니다.");
		}
		
		if(sta.equals("19110118")) {
			System.out.println("19110118가 생일이 맞습니다.");
		}else {
			System.out.println("년도 생일이 늘렸습니다.");
		}
	}
}
