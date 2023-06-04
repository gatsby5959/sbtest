package myClass;

public class arrayEx1 {
	public static void main(String[] args) {
	
		int sum = 0;        // 총점을 저장하기 위한 변수
		float average = 0f; // 평균을 저정하기 위한 변수
		
		int[] score = { 100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length;  i++){ // length 크기를 구하는(갯수)
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("갯수 : " + score.length);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
