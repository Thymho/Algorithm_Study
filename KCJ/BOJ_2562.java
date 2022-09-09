import java.util.*;
import java.io.*;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        int index = 0;
        
        for(int i=0; i<9; i++) {
            if(max < nums[i]) {
                max = nums[i];
                index = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
    }
}