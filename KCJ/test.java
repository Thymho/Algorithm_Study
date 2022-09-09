import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int T = Integer.parseInt(st.nextToken());
        int[] nums = new int[3];
        
        for(int i=0; i<T; i++) {
        	st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++) {
            	nums[j] = Integer.parseInt(st.nextToken());        	
            }
            
            for(int j=0; j<3; j++) {
            	for(int k=j+1; k<3; k++) {
            		if(nums[j] > nums[k]) {
            			int temp = nums[j];
            			nums[j] = nums[k];
            			nums[k] = temp;
            		}
            	}
            }
            
            System.out.println(nums[0]);
        }
    }
}