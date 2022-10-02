public class BOJ_4673 {
	
	static boolean[] check = new boolean[100000];
	
	public static void main(String[] args) {
		// TODO �ܰ躰 Ǯ�� - �����ѹ�
		
		for(int i=1; i<=10000; i++) {
			d(i);
			if(check[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	static void d(int i) {
		//TODO �����ѹ� ���� (1~10000)
		
		if(i/10 == 0) {
			//1�� �ڸ�
			check[i+i] = true;
		} else if(i/10 >= 1 && i/10 <= 9) {
			//10�� �ڸ�
			check[i+i/10+i%10] = true;
		} else if(i/100 >= 1 && i/100 <= 9) {
			//100�� �ڸ�
			check[i+(i/100)+(i%100/10)+(i%10)] = true;
		} else if(i/1000 >= 1 && i/1000 <= 9) {
			//1000�� �ڸ�
			check[i+(i/1000)+(i%1000/100)+(i%100/10)+(i%10)] = true;
		}
	}
}