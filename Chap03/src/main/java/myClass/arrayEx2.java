package myClass;

public class arrayEx2 {
	public static void main(String[] args) {
		
		int[][] score = { {100, 100, 100} // i = 0 
		                , {20, 20, 30}    // i = 1
		                , {30, 30, 30}    // i = 2
		                , {40, 40, 40}    // i = 3 
		                , {50, 50, 50}    // i = 4 
		                };
		int koreanTota = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균 ");
		System.out.println("======================");
		
		for(int i = 0 ; i < score.length; i++) {
			int sum = 0;
			koreanTota   += score[i][0]; // 2차원배열 값
			englishTotal += score[i][1];
			mathTotal    += score[i][2];
			
			System.out.print(" " + (i + 1)+ " "); // 번호 값 출력
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];                   // 총점 구하는 부분
				System.out.print(score[i][j] + " ");  // 총점 출력 부분
			}//2포문 끝
			
			System.out.println(sum + " " + sum/(float)score[i].length); // 총점, 평균 출력값
		} //1포문 끝
		
		System.out.println("======================");
		System.out.println("총점: " + koreanTota + " " + englishTotal + " " + mathTotal);
	}
}
