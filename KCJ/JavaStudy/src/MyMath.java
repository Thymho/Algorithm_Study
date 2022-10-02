public class MyMath {
	
	//정수를 제곱하는 메소드
	int square(int i) {
		return i*i;
	}
	
	//실수를 제곱하는 메소드
	double square(double i) {
		return i*i;
	}
	
	public static void main(String[] args) {
		MyMath obj = new MyMath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));
	}
}