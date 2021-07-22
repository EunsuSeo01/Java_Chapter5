/**
 * 커맨드라인을 통해 사칙연산을 수행하는 수식을 입력받아서 계산하여 출력해 주는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-22
 */
public class ArrayEx17 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java ArrayEx17 NUM1 OPO NUM2");
			System.exit(0);
		}
		
		// 커맨드라인으로 입력받은 데이터는 모두 문자열이라서 숫자로 변환이 필요.
		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);	// 문자열 args의 두 번째 요소의 첫 번째 문자를 문자로서 가져옴. (어차피 문자열 길이도 1일 것임)
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과:" + result);
	}
}
