import java.io.*;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			
			if(temp < 97) {
				temp += 32;
			}
			
			++count[temp-97];
		}
		
		int max = 0;
		
		for(int i=0; i<26; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		
		loop: for(int i=0; i<26; i++) {
			if(max == count[i]) {
				char answer = (char) (i+65);
				
				for(int j=0; j<26; j++) {
					if(max == count[j] && i != j) {
						System.out.println("?");
						break loop;
					}
				}
				
				System.out.println(answer);
				
				break;
			}
		}
	}
}