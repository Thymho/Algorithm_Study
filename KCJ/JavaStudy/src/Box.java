import java.util.*;

public class Box {
	public static void main(String[] args) {
		
		double width = 0, height = 0, area = 0, perimeter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하시오: ");
		width = sc.nextDouble();
		
		System.out.print("사각형의 세로를 입력하시오: ");
		height = sc.nextDouble();
		
		area = width*height;
		perimeter = 2*(width+height);
		
		System.out.println("사각형의 넓이는 "+area);
		System.out.println("사각형의 둘레는 "+perimeter);
		
		sc.close();
	}
}