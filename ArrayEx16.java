/**
 * 커맨드라인을 통해 입력받은 문자열들을 출력해 보는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}
