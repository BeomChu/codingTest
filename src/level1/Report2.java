package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Report2 {

    public static void main(String[] args) {
        Report2 report2=new Report2();
        String[] id={"muzi", "frodo", "apeach", "neo"};
        String[] re={"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k=2;
        report2.solution(id,re,k);
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        String[] newReport=newReportList(report);
        int[] answer = answer(id_list,newReport,k);
        for(int i : answer){
            System.out.println(i);
        }
        return answer;
    }



    public String[] newReportList(String[] report){ //중복신고 제거
        Set<String> set=new HashSet<>();
        for (String s : report) {
            set.add(s);
        }
        return set.toArray(new String[0]);
    }
    public int reportCount(String[] report,String id){
        int count=0;
        for (String s :  report) {
            int index=s.indexOf(" ");
            if (s.substring(index+1).equals(id)){
                count++;
            }
        }
        return count;
    }

    public int[] answer(String[] id_list,String[] report, int k){
        Set<String> reportList=new HashSet<>();
        int[] answer = new int[id_list.length];
        for (String s : report) {
            int index = s.indexOf(" ");
            reportList.add(s.substring(index+1)); // 신고 당한사람만 추리기
        }
        for(String id : reportList){
            int count=reportCount(report,id);
            System.out.println(count+"!!");
            if (count>=k){
                for(String d: report){
                    int index=d.indexOf(" ");
                    if(d.substring(index+1).equals(id)){
                        for(int i =0; i< id_list.length;i++){
                            if(id_list[i].equals(d.substring(0,index))) {
                                answer[i]++;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
}
