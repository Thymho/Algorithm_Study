import java.util.*;
import java.io.*;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if(M-45 < 0) {
            if(H>0) {
                --H;
            } else {
                H = 23;
            }
            M = (60+M)-45;
        } else {
            M -= 45;
        }
        
        System.out.print(H+" "+M);
    }
}