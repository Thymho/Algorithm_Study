//import java.util.*;

public class Question14 {
	public static void main(String[] args) {
		
//		int[] nums = new int[10];
//		int min = 0, max = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(nums.length+"���� ���ڸ� �Է��Ͻÿ�.: ");
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<nums.length; i++) {
//			for(int j=0; j<nums.length; j++) {
//				if(nums[i] > nums[j]) {
//					min = nums[j];
//				} else if(nums[i] < nums[j]){
//					max = nums[j];
//				}
//			}
//		}
//		
//		System.out.println("�ּҰ��� "+min);
//		System.out.println("�ִ��� "+max);
//		
//		sc.close();
		
		int s[] = {90, 84, 29, 90, 94};
		int min, max;
		
		min = s[0];
		max = s[0];
		
		for(int i=1; i<s.length; i++) {
			if(s[i] < min) {
				min = s[i];
			} else if(s[i] > max) {
				max = s[i];
			}
		}
		
		System.out.println("�ּҰ��� "+min+"�Դϴ�.");
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
	}
}