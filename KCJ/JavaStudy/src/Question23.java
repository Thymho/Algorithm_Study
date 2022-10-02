import java.util.Scanner;

public class Question23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.print("문자열을 입력하세요> ");
			str = sc.next();
			
			if(str.equals("quit") == true) {
				break;
			}
			
			if(str.matches("^www\\.().+") == true) {
				System.out.println(str+"은 "+"'www'"+"로 시작합니다.");
			} else {
				System.out.println(str+"은 "+"'www'"+"로 시작하지 않습니다.");
			}
		}
		
		sc.close();
	}
}