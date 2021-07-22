/**
 * 연속적인 범위의 값으로 배열을 채우는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class randomNumArr {
	public static void main(String[] args) {
		int[] randomArr = new int[10];
		
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 10);
			System.out.println("randomArr[" + i + "] : " + randomArr[i]);
		}
	}
}
