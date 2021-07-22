/**
 * 0과 9 사이의 임의의 값으로 배열을 채우고, 버블정렬 알고리즘을 통해 크기순으로 정렬하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));	// 랜덤 값 받고 배열에 저장 후 값 출력.
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지 체크. 매 반복마다 false로 초기화.
			
			// 내부의 비교작업 실시. (근접한 값과 비교해서 자리 바꿔야 하는지 안 바꿔야 하는지)
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;	// 자리바꿈 발생 -> changed의 값을 true로.
				}
			}
			
			// 바로 위의 for문에서 changed의 값이 true로 바뀌지 않았다면 정렬이 이미 완료되었다는 뜻 = break로 for문 탈출.
			if (!changed) break;
			
			// 내부의 for문 다 돌때마다(step by step) 결과 출력.
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
}
