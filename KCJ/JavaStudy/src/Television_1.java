public class Television_1 {
	
	int channel; //ä�ι�ȣ
	int  volume; //����
	boolean onOff; //���� ����
	
	void print() { //�޼ҵ� �߰�
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChnnel(int ch) {
		channel = ch;
	}
	
	public static void main(String[] args) {
		Television_1 myTv = new Television_1();
		myTv.setChnnel(11);
		myTv.volume = 9;
		myTv.onOff = true;
		
		int ch = myTv.getChannel();
		
		Television_1 yourTv = new Television_1();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
		myTv.print();
		yourTv.print();
	}
}