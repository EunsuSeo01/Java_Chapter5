/**
 * 배열 numArr에 저장된 각 숫자가 나타나는 횟수를 배열 counter에 저장하여 출력하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);	// 0~9의 임의의 수를 배열에 저장.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;	// numArr[i]에 저장된 값을 counter의 인덱스로 삼아서 해당 인덱스의 값을 1 증가시킴.
									// -> 해당 인덱스의 값이 몇 번 나왔는지가 counter에 저장됨.
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
