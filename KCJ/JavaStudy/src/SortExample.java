import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i=0; i<10; i++) {
			array[i] = (int) (Math.random()*100);
		}
		
		System.out.print("������ ����Ʈ: ");
		for (int i:array) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n���� �� ����Ʈ: ");
		Arrays.sort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
}