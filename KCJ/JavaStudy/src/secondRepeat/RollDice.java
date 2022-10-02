package secondRepeat;

public class RollDice {

	public static void main(String[] args) {
		
		int[] dice = new int[6];
//		int rem = 0, num = 0;
		
		for(int i=0; i<10000; i++) {
//			num = (int) (Math.random()*6);
//			rem = num%6;
//			
//			if(num == rem) {
//				++dice[num];
//			}
			
			++dice[(int)(Math.random()*6)];
		}
		System.out.println("===========================");
		System.out.println("¸é     ºóµµ");
		System.out.println("===========================");
		for(int i=0; i<dice.length; i++) {
			System.out.println((i+1)+"     "+dice[i]);
		}
	}
}