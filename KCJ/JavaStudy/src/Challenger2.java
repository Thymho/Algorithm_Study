import java.util.Scanner;

public class Challenger2 {
	public static void main(String[] args) {
		System.out.println("a�� ���� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		//�������� �Է��� �޴� �Ϳ� ���� ������ �ؼ�
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
			
			System.out.println("���� "+r1);
			System.out.println("���� "+r2);
		} else {
			System.out.println("�������� ���� ���Դϴ�.");
		}
		
		sc.close();
	}
}