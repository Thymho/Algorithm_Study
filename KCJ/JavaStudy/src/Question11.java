public class Question11 {
	public static void main(String[] args) {
		long num = 1, per = 1;
		
		for(int i=40; i<46; i++) {
			num *= i;
		}
		
		System.out.println(num);
		
		for(int i=1; i<7; i++) {
			per *= i;
		}
		
		System.out.println("·Î¶Ç 1µî È®·ü: 1/"+num/per);
	}
}