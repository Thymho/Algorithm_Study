import java.util.*;

public class Score2Grade {
	public static void main(String[] args) {	
		
		char grade2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = sc.nextInt();
		score = score/10;
		
		switch(score) {
			case 10:
			case 9:
				grade2 = 'A';
				break;
			case 8:
				grade2 = 'B';
				break;
			case 7:
				grade2 = 'C';
				break;
			case 6:
				grade2 = 'D';
				break;
			default:
				grade2 = 'F';
				break;
		}
		
		sc.close();
	
		System.out.println("����: "+grade2);
	}
}