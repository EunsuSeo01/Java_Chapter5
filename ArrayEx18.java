/**
 * 2차원 배열을 생성과 동시에 초기화를 하고 총합을 구하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-23
 */
public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] score = {
							{ 100, 100, 100 },
							{ 20, 20, 20 },
							{ 30, 30, 30 },
							{ 40, 40, 40 }
						};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
			}
		}
		
		// 향상된 for문으로 2차원 배열을 읽어오는 방법. -> for-each문을 중첩해서 사용한다.
		// 2차원 배열인 score의 각 요소는 1차원 배열이기 때문에 바로 int i로 받을 수 없고,
		// int[]인 tmp에 먼저 score의 각 요소(1차원 배열)를 저장한 다음에 tmp의 각 요소(int형 값)를 int i에 저장한다.
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum = " + sum);
	}
}
