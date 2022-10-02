package secondRepeat;

import java.util.*;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("숫자를 입력해주세요.: ");
			nums[i] = sc.nextInt();
//			sc.next();
		}
		
		System.out.print("탐색할 값을 입력하시오.: ");
		int number = sc.nextInt();
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == number) {
				System.out.println(number+"값은 "+i+"에 있습니다.");
			}
		}
		
		sc.close();
	}
}