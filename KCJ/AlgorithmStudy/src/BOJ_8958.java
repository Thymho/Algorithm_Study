import java.util.*;
import java.io.*;

public class BOJ_8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
//        int size = Integer.parseInt(st.nextToken());
//        String[] oxQuiz = new String[size];
//        
//        for(int i=0; i<size; i++) {
//            oxQuiz[i] = br.readLine();
//            int combo = 0, answer = 0, k=0;
//            for(int j=0; j<oxQuiz[i].length(); j++) {
//            	if(k+1 == oxQuiz[i].length() && oxQuiz[i].charAt(k)==oxQuiz[i].charAt(j) 
//            		&& oxQuiz[i].charAt(k) == 'O') {
//        			answer += ++combo;
//        		}
//            	
//            	for(k=j+1; k<oxQuiz[i].length();) {
//            		if(oxQuiz[i].charAt(k)==oxQuiz[i].charAt(j)&&oxQuiz[i].charAt(k)=='O'
//        				|| oxQuiz[i].charAt(j)=='O') {
//            			  answer += ++combo;
//	                  }
//	                  
//	                  if(oxQuiz[i].charAt(j) == 'X') {
//	                      combo = 0;
//	                  }
//	                  
//	                  break;
//	            	}
//            }
//            
//            System.out.println(answer);
//        }
        
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<n; i++) {
        	int combo = 0, answer = 0;
        	String str = br.readLine();
        	
        	for(int j=0; j<str.length(); j++) {
        		if(str.charAt(j) == 'O') {
        			answer += ++combo;
        		} else if(str.charAt(j) == 'X') {
        			combo = 0;
        		}
        	}
        	
        	System.out.println(answer);
        }
    }
}