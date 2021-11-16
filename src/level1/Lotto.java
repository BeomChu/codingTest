package level1;

public class Lotto {
    public static void main(String[] args) {
        Lotto a=new Lotto();
        int[] lottos={44,1,0,0,31,25};
        int[] win_nums={31,10,45,1,6,19};
        a.solution(lottos,win_nums);
        System.out.println(lottos);

        //된거, 안된거 ,된게 6개면 1, 1개면 6
        //트루가 생기면 -1 false가 있으면 말고 if 0이면 chance +1 +1
    }

        public int[] solution(int[] lottos, int[] win_nums) {
        int[] t={1,2,3,4,5,6,6};
        int a=6;
        int b=0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
               b++; continue;
            }else{
                for(int j=0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        a--;
                    }
                }
            }
        }


            int[] answer = {t[a-b],t[a]};


            return answer;
        }


}
