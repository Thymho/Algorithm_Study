import java.util.*;

public class InputString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = sc.nextInt();
		
		System.out.println(name+"�� �ȳ��ϼ���! "+age+"���̽ó׿�.");
		
		sc.close();
	}
}