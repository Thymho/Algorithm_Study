import java.util.*;

public class Challenger10 {
	public static void main(String[] args) {
		
		System.out.print("배열 요소의 총 개수를 입력하시오.: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] strArray = new String[size];
		String answer = null;
		
		sc.nextLine();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print("배열안에 들어갈 문자열을 입력하세요.: ");
			strArray[i] = sc.nextLine();
		}
		
		for(int i=0; i<strArray.length; i++) {
			for(int j=1; j<strArray.length; j++) {
				if(strArray[i].length() > strArray[j].length()) {
					answer = strArray[i];
				}
			}
		}
		sc.close();
		
		System.out.println("\n가장 길이가 긴 문자열은 "+answer+" 입니다.");
	}
}