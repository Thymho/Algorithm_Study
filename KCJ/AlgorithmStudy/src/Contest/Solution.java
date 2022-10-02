package Contest;
import java.util.*;

public class Solution {
	
	static int[] answer = new int[2];
	
	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] pricivate = {"2021.05.02 A", "2022.02.19 C"};
		System.out.println(solution(today, terms, pricivate));
	}
	
   public static int solution(String today, String[] terms, String[] privacies) {
	    // -------------------------- values ---------------------------------------

        List<Integer> answerList = new ArrayList<Integer>();
        String[] todayStrArr = today.split("\\.");
        String todayTemp = "";
        int todayInt = 0;
        String[][] termsArr = new String[terms.length][terms.length];
        int[] month = new int[terms.length];
        String[][] priArr = new String[privacies.length][privacies.length];
        String[][] priDateArr = new String[privacies.length][privacies.length];
        String[] priDateTempArr = new String[privacies.length];
        String priDateTemp = "";
        int[] priDateIntArr = new int[privacies.length];
        int priMonth = 0;
        int priYear = 0;
        
// ---------------------------- main ----------------------------------------

        //today ���ڿ� '.'�� �����ϰ� ��ħ
        for(int i=0; i<3; i++) {
            todayTemp = todayTemp + todayStrArr[i];
        }
        
        todayInt = Integer.parseInt(todayTemp);

        //terms �迭 ���빰 split ó��, ��ȿ�Ⱓ int�� ��ȯ
        for(int i=0; i<terms.length; i++) {
            termsArr[i] = terms[i].split(" ");
            month[i] = Integer.parseInt(termsArr[i][1]);
        }

        //privacies �迭 ���빰 split ó��
        for(int i=0; i<privacies.length; i++) {
            priArr[i] = privacies[i].split(" ");
            priDateArr[i] = priArr[i][0].split("\\.");
            
            //��� ������ ���� ���� ã�Ҵٸ� privacies�� ��¥�� ���κп� �����ش�.
            for(int j=0; j<terms.length; j++) {
                if(priArr[i][1].equals(termsArr[j][0])) {
                    priMonth = Integer.parseInt(priDateArr[i][1]) + 
                                Integer.parseInt(termsArr[j][1]);
                }

                //���࿡ priMonth�� 12�� �Ѵ´ٸ�
                if(priMonth > 12) {
                    priYear = Integer.parseInt(priDateArr[i][0])+1;
                    priMonth -= 12;
                    priDateArr[i][0] = String.valueOf(priYear);
                }

                if(priMonth/10 < 1) {
                    priDateArr[i][1] = 0+String.valueOf(priMonth);
                } else {
                    priDateArr[i][1] = String.valueOf(priMonth);
                }
            }

            priDateTemp = "";
            
            //������ ��¥�� �����ϴ� �۾��� ���� �ݺ���
            for(int j=0; j<3; j++) {
                priDateTemp = priDateTemp + priDateArr[i][j];
            }
            
            priDateTempArr[i] = priDateTemp;
            priDateIntArr[i] = Integer.parseInt(priDateTempArr[i]);

            //privacies�� ��¥�� today�� ��¥��
            if(todayInt - priDateIntArr[i] < 0) {
                answerList.add(i+1);
            }
        }

        for (int i = 0 ; i < answerList.size(); i++) {
            answer[i] = answerList.get(i).intValue();
        }

        return answer[0];
    }
}
