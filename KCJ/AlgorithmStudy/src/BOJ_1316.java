import java.io.*;
import java.util.*;

public class BOJ_1316 {
	public static void main(String[] args) throws IOException{
		// TODO �ܰ躰 Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		int N = Integer.parseInt(st.nextToken());
//		int answer = 0;
//		for(int i=0; i<N; i++) { //���ڿ� �Է��ϴ� �ݺ���
//			char[] charArray = br.readLine().toCharArray();
//			
//			loop: for(int j=0; j<charArray.length; j++) {//char �迭�� ù��° �ݺ���
//				for(int k=charArray.length-1; k>-1; k--) { //char �迭�� �ι�° �ݺ���
//					if(charArray[j] == charArray[k]) {
//						if(k-j == 1) {
//							++answer;
//							break loop;
//						}
//					} else if(k-j == 0 && charArray[k] != charArray[j]) {
//						++answer;
//						break loop;
//					}
//				}
//			}
//			
//		}
//		
//		System.out.println(answer);
		
//		int[] count = new int[26];
//		int N = Integer.parseInt(st.nextToken());
//		int answer = 0;
//		
//		for(int i=0; i<N; i++) {
//			String str = br.readLine();
//			int countOne = 0;
//			
//			for(int j=1; j<str.length(); j++) {
//				if(str.charAt(j) == str.charAt(j-1)) {
//					str = str.replace(str.charAt(j), ' ');
//					break;
//				}
//			}
//			
//			str = str.replaceAll(" ", "");
//			char[] charArray = str.toCharArray();
//			
//			for(int j=0; j<26; j++) {
//				for(int k=0; k<str.length(); k++) {
//					++count[charArray[k]-'a'];
//					if(count[charArray[k]-'a'] == 1) {
//						++countOne;
//					}
//				}
//			}
//			
//			if(countOne == str.length()) {
//				++answer;
//			}
//		}
//		
//		System.out.println(answer);
		
//		int N = Integer.parseInt(st.nextToken());
//		int answer = 0;
//		
//		for(int i=0; i<N; i++) {
//			String str = br.readLine();
//			int[] count = new int[27];
//			
//			for(int j=0; j<str.length(); j++) {
//				char temp = str.charAt(j);
//				int preIndex = temp - '`' - 1;
//				++count[temp-'`'];
//				
//				for(int k=1; k<=count.length; k++) {
//					if(count[temp-'`'] >= 1 && count[k] >= 1 && count[preIndex] != count[temp-'`']) {
//						if(count[temp-'`'] != count[k]) {
//							break;
//						}
//					} else {
//						++answer;
//						break;
//					}
//				}
//			}
//		}
//		
//		System.out.println(answer);
		
		int N = Integer.parseInt(st.nextToken());
		int answer = N;
		
		for(int i=0; i<N; i++) { //�ܾ� ���� �ݺ�
			String str = br.readLine();
			boolean[] test = new boolean[26];
			
			for(int j=0; j<str.length()-1; j++) { //�Է¹��� ���ڿ���ŭ �ݺ�
				if(str.charAt(j) != str.charAt(j+1)) {
					if(test[str.charAt(j+1)-'a'] == true) {
						--answer;
						break;
					}
				}
				test[str.charAt(j)-'a'] = true;
			}
		}
		
		System.out.println(answer);
	}
}