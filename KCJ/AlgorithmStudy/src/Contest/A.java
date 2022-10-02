package Contest;
import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException{
		// TODO ´ëÈ¸
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
//		int num1 = (int)(Math.random()*100) +10;
//		int num2 = (int)(Math.random()*100) +10;
//		System.out.print(num1+" "+num2);
		
		int a = 100 - num1;
		int b = 100 - num2;
		int c = 100-(a+b);
		int d = a*b;
		int q=0 , r=0;
		
//		if(d/10 >= 1) {
//			q = d/100;
//			r = d%100;
//		}
		
//		if(d/100 >= 1) {
		q = d/100;
		r = d%100;
//		}
		
		System.out.print(a+" "+b+" "+c+" "+d+" "+q+" "+r);
//		System.out.print("\n"+a+" "+b+" "+c+" "+d+" "+q+" "+r);
		
		System.out.print("\n"+(c+q)+" "+r);
	}

}
