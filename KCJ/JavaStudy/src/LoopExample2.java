import java.util.Scanner;

public class LoopExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�.: ");
			int num = sc.nextInt(), i = 0;
			
			if(num > 0) {
				while(i < 10) {
					System.out.println(num+"*"+i+ " = "+num*i);
					i++;
				}
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		sc.close();
	}
}