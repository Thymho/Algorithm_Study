class A{
	private int a;
	int b;
	public int c;
}

public class Test {
	public static void main(String[] args) {
		A obj = new A();
		
		//obj.a = 10; - private라서 접근 불가
		obj.b = 20;
		obj.c = 30;
	}
}