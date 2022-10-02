public class BOJ_4673 {
	
	static boolean[] check = new boolean[100000];
	
	public static void main(String[] args) {
		// TODO 단계별 풀이 - 셀프넘버
		
		for(int i=1; i<=10000; i++) {
			d(i);
			if(check[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	static void d(int i) {
		//TODO 셀프넘버 계산기 (1~10000)
		
		if(i/10 == 0) {
			//1의 자리
			check[i+i] = true;
		} else if(i/10 >= 1 && i/10 <= 9) {
			//10의 자리
			check[i+i/10+i%10] = true;
		} else if(i/100 >= 1 && i/100 <= 9) {
			//100의 자리
			check[i+(i/100)+(i%100/10)+(i%10)] = true;
		} else if(i/1000 >= 1 && i/1000 <= 9) {
			//1000의 자리
			check[i+(i/1000)+(i%1000/100)+(i%100/10)+(i%10)] = true;
		}
	}
}