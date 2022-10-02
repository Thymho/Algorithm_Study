public class BitOperator {
	public static void main(String[] args) {
		
		int x = 0x0fff;
		int y = 0xfff0;
		
		System.out.printf("%x \n", (x & y));
		System.out.println("x & y�� "+(x & y)+"�Դϴ�.");
		
		System.out.printf("%x \n", (x | y));
		System.out.println("x | y�� "+(x | y)+"�Դϴ�.");
		
		System.out.printf("%x \n", (x ^ y));
		System.out.println("x ^ y�� "+(x ^ y)+"�Դϴ�.");
		
		System.out.printf("%x \n", (~x));
		System.out.println("~x�� "+(~x)+"�Դϴ�.");
		
		//16������ ��� �ϳ��� 2������ 4���� �ִ� �Ͱ� ����.
		//���� >>4�� ����� 16������ ǥ���ϸ� 1ĭ �ű� �Ͱ� ���� ���̴�.
		System.out.printf("%x \n", (x << 4));
		System.out.println("x << 4�� "+(x << 4)+"�Դϴ�.");
		
		System.out.printf("%x \n", (x >> 4));
		System.out.println("x >> 4�� "+(x >> 4)+"�Դϴ�.");
		
		//-1�� ��ȣ ��Ʈ�� ������� �ʰ� 0���� ä���. : ���� > ����� �ٲ� �� ����
		System.out.printf("%x \n", (-1 >>> 4));
		System.out.println("-1 >>> 4�� "+(-1 >>> 4)+"�Դϴ�.");
	}
}