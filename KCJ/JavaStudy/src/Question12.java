import java.util.*;

public class Question12 {
	public static void main(String[] args) {
		
		int[] grade = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("성적을 입력하시오: ");
			grade[i] = sc.nextInt();
			sum += grade[i];
		}
		
		System.out.println("평균 성적은 "+sum/5+"입니다");
		
		sc.close();
	}
}