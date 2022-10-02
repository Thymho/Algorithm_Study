import java.util.*;

public class SwitchCaseExample3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.: ");
		int rsp_p1 = sc.nextInt();
		int rsp_com = (int)(Math.random()*3)+1;
		
		System.out.println("당신은 "+rsp_p1+"입니다.");
		System.out.println("컴퓨터는 "+rsp_com+"입니다.");
		
		if(rsp_p1>0 && rsp_com<4) {
			switch(rsp_p1-rsp_com) {
				case 0:
					System.out.println("비겼습니다.");
					break;
				case 1:
					System.out.println("당신이 이겼습니다.");
					break;
				case 2:
					System.out.println("컴이 이겼습니다.");
					break;
			}
		} else {
			System.out.println("입력값이 잘못되었습니다.");
		}
		
		sc.close();
	}
}