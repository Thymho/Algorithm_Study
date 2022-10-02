import java.util.*;

public class Question15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int index, search_value, size = 0;
		int[] nums;
		
		do {
			System.out.print("배열의 크기를 입력하시오.: ");
			size = sc.nextInt();
			
			nums = new int[size];
			index = -1;
			
			System.out.print(size+"개의 숫자를 입력해주세요.: ");
			for(int i=0; i<nums.length; i++) {
				nums[i] = sc.nextInt();
			}
			
			System.out.print("탐색할 값을 입력하시오.: ");
			
			search_value = sc.nextInt();
			
			for(int i=0; i<nums.length; i++) {
				if(search_value == nums[i]) {
					index = i;
				}
			}
			
			if(index<nums.length && index >= 0) {
				System.out.println(search_value+"값은 "+index+"위치에 있습니다.");
			} else {
				System.out.println("값이 없습니다. 다시 시도해주세요.");
			}
		} while(index < 0);
		
		sc.close();
		
//		int s[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		int value, index = -1;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("탐색할 값을 입력하시오.: ");
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
//			System.out.println(""+value+"값은 "+index+"위치에 있습니다.");
//		} else {
//			System.out.println("값이 없습니다.");
//		}
//		
//		sc.close();
	}
}