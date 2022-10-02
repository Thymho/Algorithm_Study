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

        //today 문자열 '.'을 제외하고 합침
        for(int i=0; i<3; i++) {
            todayTemp = todayTemp + todayStrArr[i];
        }
        
        todayInt = Integer.parseInt(todayTemp);

        //terms 배열 내용물 split 처리, 유효기간 int로 변환
        for(int i=0; i<terms.length; i++) {
            termsArr[i] = terms[i].split(" ");
            month[i] = Integer.parseInt(termsArr[i][1]);
        }

        //privacies 배열 내용물 split 처리
        for(int i=0; i<privacies.length; i++) {
            priArr[i] = privacies[i].split(" ");
            priDateArr[i] = priArr[i][0].split("\\.");
            
            //약관 종류가 같은 것을 찾았다면 privacies의 날짜의 월부분에 더해준다.
            for(int j=0; j<terms.length; j++) {
                if(priArr[i][1].equals(termsArr[j][0])) {
                    priMonth = Integer.parseInt(priDateArr[i][1]) + 
                                Integer.parseInt(termsArr[j][1]);
                }

                //만약에 priMonth가 12가 넘는다면
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
            
            //나눠진 날짜를 저장하는 작업을 위한 반복문
            for(int j=0; j<3; j++) {
                priDateTemp = priDateTemp + priDateArr[i][j];
            }
            
            priDateTempArr[i] = priDateTemp;
            priDateIntArr[i] = Integer.parseInt(priDateTempArr[i]);

            //privacies의 날짜와 today의 날짜비교
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
