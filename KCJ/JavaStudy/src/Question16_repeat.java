import java.util.Scanner;

public class Question16_repeat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주사위를 던질 횟수를 입력하시오.: ");
		int count = sc.nextInt();
		int[] array = new int[6];
		
		for(int i=0; i<count; i++) {
			++array[(int) (Math.random()*6)];
		}
		
		System.out.println("=======================");
		System.out.println("면   빈도");
		System.out.println("=======================");
		
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+"   "+array[i]);
		}
		sc.close();
	}
}