import java.util.*;

public class LoopExample1_Challenger {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.: ");
		int num = sc.nextInt(), i = 0;
		
		if(num > 0) {
			while(i<num) {
				System.out.print(i+" ");
				i++;
			}
		} else if(num < 0){
			while(i>num) {
				System.out.print(i+" ");
				i--;
			}
		} else {
			System.out.print(0);
		}
		
		sc.close();
	}
}
