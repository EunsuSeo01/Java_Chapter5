/**
 * 배열의 앞 6개 인덱스의 값들을 임의의 인덱스의 값과 바꿔서 섞는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx8 {
	public static void main(String[] args) {
		int[] ball = new int[45];	// 45개의 정수값을 저장하기 위한 배열 생성.
		
		// 배열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int temp = 0;	// 두 값을 바꾸는 데 사용할 임시 변수.
		int j = 0;		// 임의의 값을 얻어서 저장해둘 변수. 랜덤 인덱스.
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n", i, ball[i]);
		}
	}
}
