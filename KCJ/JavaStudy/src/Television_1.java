public class Television_1 {
	
	int channel; //채널번호
	int  volume; //볼륨
	boolean onOff; //전원 상태
	
	void print() { //메소드 추가
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
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
		
		System.out.println("현재 채널은 "+ch+"입니다.");
		myTv.print();
		yourTv.print();
	}
}