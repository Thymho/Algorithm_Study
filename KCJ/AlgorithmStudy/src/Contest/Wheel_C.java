package Contest;

import java.io.*;

public class Wheel_C {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        char[] wheel = br.readLine().toCharArray();
        int M = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int now = N-1;
        int answer = 0;
        
        loop: for(int i=1; i<M; i++) {
            char target = S[i];
            int start = now;
            
            if(S[i-1] != S[i]) {
                while(target != wheel[now]) {
                    if(now == N-1) {
                        now = 0;
                    } else {
                        ++now;
                    }
                    
                    if(start == now) {
                       answer = -1;
                       break loop; 
                    }
                    
                    ++answer;
                }
            } else {
                answer += N;
            }
        }
        
        System.out.println(answer);
    }
}