public class MyMath {
	
	//������ �����ϴ� �޼ҵ�
	int square(int i) {
		return i*i;
	}
	
	//�Ǽ��� �����ϴ� �޼ҵ�
	double square(double i) {
		return i*i;
	}
	
	public static void main(String[] args) {
		MyMath obj = new MyMath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	}
}