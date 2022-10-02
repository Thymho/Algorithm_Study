public class MyCounter_1 {
	
	int value;
//	int inc(int a) {
//		return a = a+1;
//	}
	
	void inc(int a) {
		a = a+1;
	}
	
	public static void main(String[] args) {
		MyCounter_1 obj = new MyCounter_1();
		int x = 10;
		
		obj.inc(x);
//		int a = obj.inc(x);
		System.out.println("x = "+x);
//		System.out.println(a);
	}
}