import java.io.*;

public class BOJ_1152 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 문제풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strSplit = str.split(" ");
		int size = strSplit.length;
		
		if(size > 0 && strSplit[0] == "") {
			size -= 1;
		}
		
		System.out.println(size);
	}
}