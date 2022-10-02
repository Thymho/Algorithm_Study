class Pointer{
	private int x;
	private int y;
	
	public Pointer(int a, int b) {
		x = a;
		y = b;
	}

	@Override
	public String toString() {
		return "Pointer [x=" + x + ", y=" + y + "]";
	}
	
}

public class Question28 {
	
	private int radius;
	private Pointer center;
	
	public Question28(Pointer p, int r) {
		radius = r;
		center = p;
	}
	
	@Override
	public String toString() {
		return "Question28 [radius=" + radius + ", center=" + center + "]";
	}



	public static void main(String[] args) {
		Pointer p = new Pointer(25, 78);
		Question28 c = new Question28(p, 10);
		System.out.println(c);
	}
}