import java.util.*;

public class Box {
	public static void main(String[] args) {
		
		double width = 0, height = 0, area = 0, perimeter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		width = sc.nextDouble();
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		height = sc.nextDouble();
		
		area = width*height;
		perimeter = 2*(width+height);
		
		System.out.println("�簢���� ���̴� "+area);
		System.out.println("�簢���� �ѷ��� "+perimeter);
		
		sc.close();
	}
}