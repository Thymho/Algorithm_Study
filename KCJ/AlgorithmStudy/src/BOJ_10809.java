import java.io.*;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char temp = ' ';
		int[] answer = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for(int i=0; i<str.length(); i++) {
			temp = str.charAt(i);
			for(int j=97; j<=122; j++) {
				if(temp == j) {
					if(answer[j-97] == -1) {
						answer[j-97] = i;
					}
					break;
				}
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}