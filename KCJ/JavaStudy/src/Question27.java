public class Question27 {
	
	private int hour;
	private int minute;
	private int second;
	
	public Question27() {
		this(00,00,00);
	}
	
	public Question27(int h, int m, int s) {
		hour = (h>=0 && h<24) ? h : 0;
		minute = (m>=0 && m<60) ? m : 0;
		second = (s>=0 && s<60) ? s : 0;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public static void main(String[] args) {
		Question27 time = new Question27();
		System.out.println("기본 생성자 호출 후 시간: "+time.toString());
		
		Question27 time2 = new Question27(13, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간: "+time2.toString());
		
		Question27 time3 = new Question27(24, 60, 60);
		System.out.println("올바르지 않은 시간 설정 후 시간: "+time3.toString());
	}
}