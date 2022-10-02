public class Television {
	private int channel; //채널번호
	private int  volume; //볼륨
	private boolean onOff; //전원 상태
	
	Television(int ch, int vol, boolean on){
		this.channel = ch;
		this.volume = vol;
		this.onOff = on;
	}
	
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	
	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);
		Television yourTv = new Television(7, 12, true);
		myTv.print();
		yourTv.print();
	}
}
