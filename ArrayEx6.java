/**
 * 배열의 최댓값, 최솟값을 찾는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0];	// 일단은 배열의 첫 번째 값으로 최댓값을 초기화한다.
		int min = score[0];	// 배열의 첫 번째 값으로 최솟값을 초기화한다.
		
		for (int i = 1; i < score.length; i++) {	// 배열의 두 번째 요소부터 확인하면 되니까 i를 1로 초기화함.
			if (score[i] > max)
				max = score[i];
			else if (score[i] < min)
				min = score[i];
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min); 
	}
}
