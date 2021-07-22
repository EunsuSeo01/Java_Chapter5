/**
 * String 클래스의 charAt 메소드를 사용한 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);	// src의 i번째 문자를 ch에 저장.
			System.out.println("src.charAt(" + i + "):" + ch);
		}
		
		// String을 char[]로 변환.
		char[] chArr = src.toCharArray();
		
		// char배열(char[])을 출력.
		System.out.println(chArr);	// println()으로 문자배열을 출력하면,
									// 문자열 출력하듯이 문자배열의 모든 요소를 '이어서 한 줄로 출력'함.
	}
}
