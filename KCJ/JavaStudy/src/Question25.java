public class Question25 {
	
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public Question25(int wid, int len, int hei){
		this.width = wid;
		this.length = len;
		this.height = hei;
		this.volume = width*length*height;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public static void main(String[] args) {
		Question25 box = new Question25(30, 40, 10);
		System.out.println("상자의 부피는 "+box.getVolume()+"입니다.");
	}
}