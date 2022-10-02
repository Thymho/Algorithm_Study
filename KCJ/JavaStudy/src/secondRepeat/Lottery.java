package secondRepeat;

public class Lottery {
	public static void main(String[] args) {
		
//		long sub = 1, fac = 1;
//		
//		for(int i=40; i<46; i++) {
//			sub *= i;
//		}
//		
//		for(int i=1; i<7; i++) {
//			fac *= i;
//		}
//		
//		System.out.println("·Î¶Ç 1µî È®·ü: 1/"+sub/fac);
	
		int odds = 1;
		final int n = 45;
		final int k = 6;
		
		for(int i=1; i<=k; i++) {
			odds = odds * (n - i + 1) / i;
		}
		
		System.out.println("·Î¶Ç 1µî È®·ü: 1/"+odds);
	}
}