public class BitOperator {
	public static void main(String[] args) {
		
		int x = 0x0fff;
		int y = 0xfff0;
		
		System.out.printf("%x \n", (x & y));
		System.out.println("x & y는 "+(x & y)+"입니다.");
		
		System.out.printf("%x \n", (x | y));
		System.out.println("x | y는 "+(x | y)+"입니다.");
		
		System.out.printf("%x \n", (x ^ y));
		System.out.println("x ^ y는 "+(x ^ y)+"입니다.");
		
		System.out.printf("%x \n", (~x));
		System.out.println("~x는 "+(~x)+"입니다.");
		
		//16진수의 요소 하나는 2진수가 4개가 있는 것과 같다.
		//따라서 >>4의 결과는 16진수로 표현하면 1칸 옮긴 것과 같은 것이다.
		System.out.printf("%x \n", (x << 4));
		System.out.println("x << 4는 "+(x << 4)+"입니다.");
		
		System.out.printf("%x \n", (x >> 4));
		System.out.println("x >> 4는 "+(x >> 4)+"입니다.");
		
		//-1의 부호 비트를 사용하지 않고 0으로 채운다. : 음수 > 양수로 바뀔 수 있음
		System.out.printf("%x \n", (-1 >>> 4));
		System.out.println("-1 >>> 4는 "+(-1 >>> 4)+"입니다.");
	}
}