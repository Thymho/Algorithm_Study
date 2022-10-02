import java.util.*;

public class SwitchCaseExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String capLet = sc.nextLine();
		
		char capLetChar = capLet.charAt(0);
		int charLength = capLet.length();
		
		if(charLength == 1) {
			switch(capLetChar) {
				case 'A':
					System.out.println("훌륭합니다.");
					break;
				case 'B':
					System.out.println("좋습니다.");
					break;
				case 'C':
					System.out.println("보통입니다.");
					break;
				case 'D':
					System.out.println("노력하세요");
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
			}
		} else {
			System.out.println("한글자만 입력하세요.");
		}
		
		sc.close();
	}
}