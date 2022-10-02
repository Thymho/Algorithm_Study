import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오: ");
		double radius = sc.nextDouble();
		double pi = 3.14;
		
		System.out.println(radius*radius*pi);
		
		sc.close();
	}
}