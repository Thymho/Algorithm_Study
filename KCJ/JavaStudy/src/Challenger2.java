import java.util.Scanner;

public class Challenger2 {
	public static void main(String[] args) {
		System.out.println("a의 값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		//연속으로 입력을 받는 것에 대한 불편함 해소
		String temp = sc.nextLine();
		double a = Double.parseDouble(temp);
//		double a = sc.nextDouble();
		
		
		double b = -3.0;
		double c = 2.0;
		
		double disc = b*b-4.0*c;
		
		if(disc > 0) {
			double sqr = Math.sqrt(disc);
			double r1 = 0, r2 = 0;
			
			r1 = (-b + sqr) / 2.0 * a;
			r2 = (-b - sqr) / 2.0 * a;
			
			System.out.println("근은 "+r1);
			System.out.println("근은 "+r2);
		} else {
			System.out.println("적절하지 않은 값입니다.");
		}
		
		sc.close();
	}
}