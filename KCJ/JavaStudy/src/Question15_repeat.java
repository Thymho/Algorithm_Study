import java.util.Scanner;

public class Question15_repeat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오.: ");
		int size = sc.nextInt();
		int index = -1, num = 0;
		
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("배열에 들어갈 값을 입력해주십시오.: ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("\n탐색할 값을 입력하시오.: ");
		num = sc.nextInt();
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == num) {
				index = i;
			} 
		}
		
		sc.close();
		
		if(index >= 0) {
			System.out.println(num+"값은 "+index+"위치에 있습니다.");
		} else {
			System.out.println(num+"값은 배열에 없습니다.");
		}
	}
}