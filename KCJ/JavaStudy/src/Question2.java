import java.lang.Math;

public class Question2 {
	public static void main(String[] args) {
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		
		double plus_answer;
		double minus_answer;
		
		plus_answer = (-b+Math.sqrt(b*b-4*a*c))/2*a;
		minus_answer = (-b-Math.sqrt(b*b-4*a*c))/2*a;
		
		
		
		System.out.println("���� "+plus_answer);
		System.out.println("���� "+minus_answer);
		
//		double b = -3.0;
//		double c =2.0;
//		
//		double disc = b*b-4.0*c;
//		double sqr = Math.sqrt(disc);
//		
//		double r1 = (-b + sqr) / 2.0;
//		double r2 = (-b - sqr) / 2.0;
//		
//		System.out.println("���� "+r1);
//		System.out.println("���� "+r2);
	}
}