/**
 * 불연속적인 범위의 값들로 배열을 채우는 예제
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
import java.util.*;	// Array.toString()을 사용하기 위해 추가.

public class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };	// 불연속적인 값으로 구성된 배열
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length);
			arr[i] = code[tmp];	// 배열 code의 임의의 인덱스의 값을 arr[i]에 저장.
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
