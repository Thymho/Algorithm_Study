public class MyCounter_2 {
	
	int value = 0;
	void inc(MyCounter_2 ctr) {
		ctr.value = ctr.value + 1;
	}
	
	public static void main(String[] args) {
		MyCounter_2 obj = new MyCounter_2();
		
		System.out.println("obj.value = "+obj.value);
		obj.inc(obj);
		System.out.println("obj.value = "+obj.value);
	}
}