import java.util.*;

public class Challenger7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이 몇 명인지 입력하시오.: ");
		int student = sc.nextInt();
		
		int[] grade = new int[student];
		int sum = 0;
		
		for(int i=0; i<=grade.length-1; i++) {
			
			do {
				System.out.print("성적을 입력하시오.: ");
				
				try {
					grade[i] = sc.nextInt();
				} catch(InputMismatchException err) {
					System.out.println(err);
					System.out.println("숫자만 입력해주세요.");
					sc = new Scanner(System.in);
				}
				
				if(grade[i] <= 100) {
					sum += grade[i];
				} else {
					System.out.println("잘못된 성적입니다.");
				}
				
			}while(grade[i]>100);
			
		}
		
		System.out.println("평균 성적은 "+sum/student+"입니다.");
		sc.close();
	}
}