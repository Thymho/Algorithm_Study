import java.util.Scanner;

public class Question15_repeat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ�.: ");
		int size = sc.nextInt();
		int index = -1, num = 0;
		
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("�迭�� �� ���� �Է����ֽʽÿ�.: ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("\nŽ���� ���� �Է��Ͻÿ�.: ");
		num = sc.nextInt();
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == num) {
				index = i;
			} 
		}
		
		sc.close();
		
		if(index >= 0) {
			System.out.println(num+"���� "+index+"��ġ�� �ֽ��ϴ�.");
		} else {
			System.out.println(num+"���� �迭�� �����ϴ�.");
		}
	}
}