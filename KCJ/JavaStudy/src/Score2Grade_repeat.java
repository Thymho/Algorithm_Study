import java.util.*;

public class Score2Grade_repeat {
	public static void main(String[] args) {
		
		char grade3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		score = score/10;
		
		switch(score) {
			case 10:
			case 9:
				grade3 = 'A';
				break;
			case 8:
				grade3 = 'B';
				break;
			case 7:
				grade3 = 'C';
				break;
			case 6:
				grade3 = 'D';
				break;
			default:
				grade3 = 'F';
				break;
		}
		
		sc.close();
		System.out.println("학점: "+grade3);
	}
}