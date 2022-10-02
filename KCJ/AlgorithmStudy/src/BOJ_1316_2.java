import java.util.*;
import java.io.*;

public class BOJ_1316_2 {
	public static void main(String[] args) throws IOException{
		// 단계별 문제 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int answer = N;
		
		for(int i=0; i<N; i++) { //단어 반복문
			String str = br.readLine();
			boolean[] check = new boolean[26]; //단어체크를 해주는 배열은 문자열을 입력 받을 때 마다 초기화
			
			for(int j=0; j<str.length()-1; j++) { //단어의 글자를 체크하는 반복문
				if(str.charAt(j) != str.charAt(j+1)) { //앞의 글자와 현재 글자가 서로 다를 때
					//check 배열의 해당 인덱스에 true 값이 있다면 > true 값이 있다는건 이미 그 글자가 있었다는 것이다.
					if(check[str.charAt(j+1)-'a'] == true) {
						--answer; //입력받은 문자열의 개수를 줄여준다.
						break; //반복문을 멈춰준다 > 이미 글자들을 체크해줬기 때문에.
					}
				}
				check[str.charAt(j)-'a'] = true; //두번째 for문을 거치는 모든 글자들에 true를 넣어준다. > 이는 두번째 if문에서 사용하게 된다.
			}
		}
		System.out.println(answer); //답을 출력해준다.
	}
}