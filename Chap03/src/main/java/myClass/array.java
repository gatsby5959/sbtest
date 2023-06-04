package myClass;

public class array {
	public static void main(String[] args) {
		
		int[] scorei; // 참조변수 배열 선언
		scorei = new int[4]; // 크기가 3인 int형 배열을 생성
		
		scorei [0] = 111; // 각 요소에 직접 값을 저장
		scorei [1] = 55;
		scorei [2] = 11;
		
		System.out.println("scorei[0] : " + scorei[0]);
		System.out.println("scorei[1] : " + scorei[1]);
		System.out.println("scorei[2] : " + scorei[2]);
		System.out.println("scorei[3] : " + scorei[3]);
		
		System.out.println("---------------------------------");
		
		// 크기가 3인 int형 배열을 선언과 동시에 생성
		int[] score = new int[3]; 
		
		score[0] = 100; // 각 요소에 직접 값을 저장
		score[1] = 50;
		score[2] = 10;
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		
		System.out.println("---------------------------------");
		
		// 크기가 3인 int형 배열을 선언과 동시에 생성후 각 요소에 직접 값을 저장
		int[] score1 = new int[] {101, 51, 11}; 
		
		System.out.println("score1[0] : " + score1[0]);
		System.out.println("score1[1] : " + score1[1]);
		System.out.println("score1[2] : " + score1[2]);
		
		System.out.println("---------------------------------");
		
		// 크기가 3인 String형 배열을 선언과 동시에 생성
		String[] name = new String[3];
		
		name[0] = "LEE";
		name[1] = "YOUN";
		name[2] = "GON";
		
		System.out.println("name[0] : " + name[0]);
		System.out.println("name[1] : " + name[1]);
		System.out.println("name[2] : " + name[2]);
		
		// 크기가 3인 String형 배열을 선언과 동시에 생성후 각 요소에 직접 값을 저장
		String[] name1 = new String[] {"LEE1", "YOUN1", "GON1"};
		
		System.out.println("name1[0] : " + name1[0]);
		System.out.println("name1[1] : " + name1[1]);
		System.out.println("name1[2] : " + name1[2]);
		
		
	}
}
