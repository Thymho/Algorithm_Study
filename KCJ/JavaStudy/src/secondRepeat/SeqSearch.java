package secondRepeat;

import java.util.*;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("���ڸ� �Է����ּ���.: ");
			nums[i] = sc.nextInt();
//			sc.next();
		}
		
		System.out.print("Ž���� ���� �Է��Ͻÿ�.: ");
		int number = sc.nextInt();
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == number) {
				System.out.println(number+"���� "+i+"�� �ֽ��ϴ�.");
			}
		}
		
		sc.close();
	}
}