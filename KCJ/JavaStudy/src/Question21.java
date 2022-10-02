public class Question21 {
	
	int width; //상자의 가로
	int length; //상자의 세로
	int height; //상자의 높이
	
	public static void main(String[] args) {
		
		Question21 box = new Question21();
		
		box.width = 20;
		box.length = 20;
		box.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 "+box.width+", "+box.length+", "+box.height+"입니다.");
	}
}