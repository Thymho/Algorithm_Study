public class Question24 {
	
	private int a[];
	public int length;
	
	public Question24(int size) {
		a = new int[size];
		length = size;
	}
	
	public int get(int index) {
		if(index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void put(int index, int value) {
		if(index >= 0 && index < length) {
			a[index] = value;
//			System.out.print(a[index]+" ");
		} else {
			System.out.println("잘못된 인덱스 "+index);
		}
	}
	
	public static void main(String[] args) {
		
		Question24 array = new Question24(3);
		
		for(int i=0; i<(array.length+1); i++) {
			array.put(i, i*10);
		}
	}
}