import java.util.*;

public class Question15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int index, search_value, size = 0;
		int[] nums;
		
		do {
			System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ�.: ");
			size = sc.nextInt();
			
			nums = new int[size];
			index = -1;
			
			System.out.print(size+"���� ���ڸ� �Է����ּ���.: ");
			for(int i=0; i<nums.length; i++) {
				nums[i] = sc.nextInt();
			}
			
			System.out.print("Ž���� ���� �Է��Ͻÿ�.: ");
			
			search_value = sc.nextInt();
			
			for(int i=0; i<nums.length; i++) {
				if(search_value == nums[i]) {
					index = i;
				}
			}
			
			if(index<nums.length && index >= 0) {
				System.out.println(search_value+"���� "+index+"��ġ�� �ֽ��ϴ�.");
			} else {
				System.out.println("���� �����ϴ�. �ٽ� �õ����ּ���.");
			}
		} while(index < 0);
		
		sc.close();
		
//		int s[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		int value, index = -1;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Ž���� ���� �Է��Ͻÿ�.: ");
//		
//		value = sc.nextInt();
//		
//		for(int i=0; i<s.length; i++) {
//			if(s[i] == value) {
//				index = i;
//			}
//		}
//		
//		if(index<s.length && index >= 0) {
//			System.out.println(""+value+"���� "+index+"��ġ�� �ֽ��ϴ�.");
//		} else {
//			System.out.println("���� �����ϴ�.");
//		}
//		
//		sc.close();
	}
}