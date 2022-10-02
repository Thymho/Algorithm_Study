import java.io.*;

public class BOJ_2941 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.contains("c=")) {
				str = str.replace("c=", "a");
			}
			if(str.contains("c-")) {
				str = str.replace("c-", "a");
			}
			if(str.contains("dz=")) {
				str = str.replace("dz=", "a");
			}
			if(str.contains("d-")) {
				str = str.replace("d-", "a");
			}
			if(str.contains("lj")) {
				str = str.replace("lj", "a");
			}
			if(str.contains("nj")) {
				str = str.replace("nj", "a");
			}
			if(str.contains("s=")) {
				str = str.replace("s=", "a");
			}
			if(str.contains("z=")) {
				str = str.replace("z=", "a");
			}
			
			++count;
		}
		
		System.out.println(count);
	}
}