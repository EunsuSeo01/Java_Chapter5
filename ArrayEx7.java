/**
 * 임의의 인덱스를 얻어서 그 인덱스의 값과 인덱스 0의 값을 바꿔서 배열의 값을 섞는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;	// 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// 배열의 임의의 위치(랜덤 인덱스)에 있는 값과 numArr[0]의 값을 교환하는 일을 100번 반복.
		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 10);	// 0~9 범위의 임의의 값을 얻는다!
			int tmp = numArr[0];	// 값 바꿀 때 필요한 임시 저장 공간
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
