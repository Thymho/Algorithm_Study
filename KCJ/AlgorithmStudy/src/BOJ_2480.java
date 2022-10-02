import java.util.*;
import java.io.*;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] nums = new int[3];
        int[] count = new int[7];
        int answer = 0;
        
        for(int i=0; i<3; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(nums);
        
        for(int i=0; i<3; i++) {
            for(int j=i+1; j<3; j++) {
                if(nums[i] == nums[j]) {
                    ++count[nums[i]];
                }
            }
        }
        
        for(int i=0; i<7; i++) {
            if(count[i] == 3) {
                answer = 10000+i*1000;
                break;
            } else if(count[i] == 1) {
                answer = 1000+i*100;
                break;
            } else {
                answer = nums[2]*100;
            }
        }
        
        System.out.println(answer);
    }
}