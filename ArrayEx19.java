/**
 * 학생 5명의 3개 과목의 점수를 가지고 개인의 총합과 평균을 계산하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-23
 */
public class ArrayEx19 {
	public static void main(String[] args) {
		// 5명의 학생의 3개 과목 점수.
		int[][] score = {
							{ 100, 100, 100 },
							{ 20, 20, 20 },
							{ 30, 30, 30 },
							{ 40, 40, 40 },
							{ 50, 50, 50 }
						};
		// 과목별 총점.
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("==============================");
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;	// 개인별 총점. i = 학생. 각 개인. sum 출력하고 다시 초기화 하니까 문제 없음.
			float avg = 0.0f;	// 개인별 평균.
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i + 1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];		// i(= 학생)는 같은데 j(= 3개의 각 과목 점수)만 바뀌는 것. = 개인의 점수 합산 가능.
				System.out.printf("%5d", score[i][j]);	// 한 학생의 3개 과목 점수 다 출력.
			}
			
			avg = sum / (float)score[i].length;	// 평균 계산.
			System.out.printf("%5d %5.1f\n", sum, avg);
		}
		
		System.out.println("=============================");
		System.out.printf("총점: %3d %4d %4d\n", korTotal, engTotal, mathTotal);
	}
}
