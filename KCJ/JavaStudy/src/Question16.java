//import java.util.Random;

public class Question16 {
	public static void main(String[] args) {
		
//		int num;
//		int[] countArray = new int[6];
//		
//		Random rd = new Random();
//		
//		for(int i=0; i<10000; i++) {
//			num = rd.nextInt(6)+1;
//			
//			for(int j=0; j<6; j++) {
//				if(num/(j+1) == 1) {
//					++countArray[j];
//				}
//			}
//		}
//		
//		System.out.println("===============================");
//		System.out.println("¸é   ºóµµ");
//		System.out.println("===============================");
//		
//		for(int i=0; i<6; i++) {
//			System.out.println((i+1)+"   "+countArray[i]);
//		}
		
		final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0; i<10000; i++) {
			++freq[(int) (Math.random() * SIZE)];
		}
		
		System.out.println("============================");
		System.out.println("¸é    ºóµµ");
		System.out.println("============================");
		
		for(int i=0; i<SIZE; i++) {
			System.out.println((i+1)+"    "+freq[i]);
		}
	}
}