import java.util.*;
import java.io.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] nums = new int[10];
        
        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
            nums[i] %= 42;
        }
        
        int temp = 0;
        
        for(int i=0; i<10; i++) {
        	for(int j=i+1; j<10; j++) {
        		if(nums[i] == nums[j]) {
            		++temp;
            		break;
            	}
        	}
        }
        
        System.out.println(10-temp);
    }
}