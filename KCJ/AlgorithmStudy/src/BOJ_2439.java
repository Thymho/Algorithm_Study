import java.util.*;
import java.io.*;

public class BOJ_2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<N; i++) { //�ٹٲٴ� for
        	for(int k=N-1; k>i; k--) { //���������� ���Ľ����� for
        		System.out.print(" ");
        	}
            for(int j=0; j<i+1; j++) { //����� for
                System.out.print("*");
            }
            System.out.println();
        }
    }
}