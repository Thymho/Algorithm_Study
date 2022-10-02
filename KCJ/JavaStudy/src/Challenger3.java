import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Challenger3 {
	public static void main(String[] args) {
	
//		Date date = new Date();
//		int month = date.getMonth();
//		
//		System.out.println("���� ���� "+date);
//		System.out.println(month);
//		
//		if(month >= 3 || month <= 5) {
//			System.out.println("��ũ�� ���̳׿�!");
//		} else if(month >= 6 || month <= 8) {
//			System.out.println("Ǫ���� �����̳׿�!");
//		} else if(month >=9 || month >= 10) {
//			System.out.println("û���� �����̳׿�!");
//		} else {
//			System.out.println("�Ͼ� �ܿ��̳׿�!");
//		}
		
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		
		System.out.println("���� ����: "+date);
		System.out.println(month);
		
		if(month >= 3 && month <= 5) {
			System.out.println("��ũ�� ���̳׿�!");
		} else if(month >= 6 && month <= 8) {
			System.out.println("Ǫ���� �����̳׿�!");
		} else if(month >9 && month >= 10) {
			System.out.println("û���� �����̳׿�!");
		} else {
			System.out.println("�Ͼ� �ܿ��̳׿�!");
		}
	}
}