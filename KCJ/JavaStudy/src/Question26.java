public class Question26 {
	
	private int year;
	private String month;
	private int day;
	
	public Question26(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public Question26(int y) {
		this(y, "1¿ù", 1);
	}
	
	public Question26() {
		this(1900, "1¿ù", 1);
	}
	
	@Override
	public String toString() {
		return "Question26 [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public static void main(String[] args) {
		Question26 date1 = new Question26(2015, "8¿ù", 10);
		Question26 date2 = new Question26(2020);
		Question26 date3 = new Question26();
		
		System.out.println(date1.toString());  
		System.out.println(date2.toString());
		System.out.println(date3.toString());
	}

}
