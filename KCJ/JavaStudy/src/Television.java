public class Television {
	private int channel; //ä�ι�ȣ
	private int  volume; //����
	private boolean onOff; //���� ����
	
	Television(int ch, int vol, boolean on){
		this.channel = ch;
		this.volume = vol;
		this.onOff = on;
	}
	
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);
		Television yourTv = new Television(7, 12, true);
		myTv.print();
		yourTv.print();
	}
}
