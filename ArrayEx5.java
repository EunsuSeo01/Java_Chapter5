/**
 * 배열의 총합, 평균값을 찾는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0;	// 총점을 저장하기 위한 변수
		float average = 0f;		// 평균을 저장하기 위한 변수
		
		int[] score = { 100, 88, 100, 100, 90 };
		for (int i = 0; i < score.length; i++) {
			sum += score[i];	// 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 (sum에) 더한다.
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
