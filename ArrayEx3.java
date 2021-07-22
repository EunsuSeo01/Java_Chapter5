/**
 * 기존 배열의 값을 그 배열 길이의 2배 길이를 갖는 배열에 복사.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열 arr에 1~5를 저장한다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("[변경전]");
		System.out.println("arr.length:" + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];
		
		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // tmp에는 참조변수의 주소값이 저장되어 있는데, 그 주소값을 arr에 저장한다.
					// 이제 arr와 tmp는 같은 공간을 가리키고 있게 됨. 둘은 이름만 다를 뿐, 같은 배열.
					// 배열 arr은 길이가 2배 늘어난 배열이 된 것임.
		System.out.println("[변경후]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]:" + arr[i]);
	}
}
