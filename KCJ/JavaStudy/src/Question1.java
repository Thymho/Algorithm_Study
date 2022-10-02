
public class Question1 {
	public static void main(String[] args) {
		double distance = 40e12;
		double lightSpeed = 30e4;
		double secs = distance/lightSpeed;
		double light_year = secs/(60.0*60.0*24.0*365.0);
		
		System.out.println("걸리는 시간은 "+light_year+"광년입니다.");
	}
}