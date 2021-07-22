/**
 * String 클래스의 메서드 length()와 charAt(int i) 메서드를 사용한 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx15 {
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".",
							"..-.", "--.", "....", "..", ".---",
							"-.-", ".-..", "--", "-.", "---",
							".--.", "--.-", ".-.", "...", "-",
							"..-", "...-", ".--", "-..-", "-.--",
							"--.." };
		
		String result = "";
		
		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];	// source.charAt(i)로 얻은 문자에서 문자 'A'값을 빼서
														// 나온 숫자가 배열 morse의 인덱스가 되어서
														// String result에 이어서 추가되는 것.
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);
	}
}
