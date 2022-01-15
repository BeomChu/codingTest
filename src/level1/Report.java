package level1;

import java.lang.reflect.Array;
import java.util.*;

public class Report {
    public static void main(String[] args) {
        Report report=new Report();
        String[] id_list={"muzi", "frodo", "apeach", "neo"};
        String[] report2= {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        report.solution(id_list,report2,k);
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        String[] newReport= newReport(report).toArray(new String[0]);
        int[] reportCount=getReportCount(newReport,id_list);
        int[] answer = getAnswer(reportCount,report,id_list,k);
        return answer;

    }

    public Set<String> newReport(String[] report){ // 중복거름
        Set<String> set = new HashSet<>();
        for (String s : report) {
            set.add(s);
        }
        return set;
    }

    public int[] getReportCount(String[] report,String[] id_list){    // 신고당한 횟수
        int[] reportCount=new int[id_list.length];
        String[] reportC=report.clone();
        for (String s : reportC) {
            int index=s.indexOf(" ");
            s=s.substring(index+1);
            for (int i=0;i<id_list.length;i++) {
                if(id_list[i].equals(s)){
                    reportCount[i]++;

                }
            }
        }
        return reportCount;
    }

    public int[] getAnswer(int[] reportCount,String[] report, String[] id_list,int k){
        int[] answer = new int[id_list.length];

        // i번째 배열이 k보다 같거나 크면 i번째 id_list를 substring이랑 비교해서 신고자번째 아이디랑 비교해서 answer만들기
        for(int i =0;i<reportCount.length;i++ ){

            if(reportCount[i]>=k){ // 신고 k번이상 당하면
                for (String s : report){  //신고당한거에서
                    int index=s.indexOf(" ");
                    if(id_list[i].equals(s.substring(index+1))){ //신고 잘한사람 찾기

                        for(int j =0; j<id_list.length;j++){
                            if(id_list[j].equals(s.substring(0,index))){ // 신고한사람 찾기
                                answer[j]++;
                            }
                        }
                    }
                }
            }

        }
        return answer;
    }
}