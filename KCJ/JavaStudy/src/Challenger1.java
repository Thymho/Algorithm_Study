
public class Challenger1 {
	public static void main(String[] args) {
		final double voyager_speed = 6e4;
		double distance = 40e12;
		double hour = distance/voyager_speed;
		double time = hour/(24.0*365.0);
		
		System.out.println("�ɸ��� �ð��� "+time+"���Դϴ�.");
	}
}
