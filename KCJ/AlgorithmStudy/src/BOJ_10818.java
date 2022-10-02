import java.util.*;
import java.io.*;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
            
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        
        if(N == 1) {
        	if(min < Integer.MAX_VALUE) {
        		max = min;
        	} else if(max > 0) {
        		min = max;
        	}
        }
        System.out.print(min+" "+max);
    }
}