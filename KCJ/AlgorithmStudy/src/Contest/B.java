package Contest;
import java.io.*;

public class B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ¥Î»∏
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int turn1 = 0, turn2 = 0, count = 0;
		
		while(turn1+turn2 <= N) {
			if(N-turn1 >= turn2) {
				if(count+1 >= 1) {
					turn1 += 1+count;
				} else {
					turn1 += 1;
				}
				N -= turn1;
			}
			turn2 += 1+turn1;
			N -= turn2;
			
			count += 1;
		}
		
		if(N < 0) {
			System.out.println(0);
		} else {
			System.out.println((turn2+turn1)-N);
		}
	}
}
