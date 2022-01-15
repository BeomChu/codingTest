package level1;

public class Keypad {
    public static void main(String[] args) {
        Keypad k=new Keypad();
        int numbers[]={7,0,8,2,8,3,1,5,7,6,2};
        String hand="";
        String result= k.solution(numbers,hand);
        System.out.println(result);
    }




    public String solution(int[] numbers, String hand) {
        String answer = "";
        int rememberL = 0;
        int rememberR = 0;


        for(int i=0; i<numbers.length; i++){
            switch (numbers[i]) {
                case 1: case 4: case 7:
                    answer += "L";
                    rememberL = numbers[i];
                    continue;
                case 3: case 6: case 9:
                    answer += "R";
                    rememberR = numbers[i];
                    continue;
                case 2: case 5: case 8:
                    int absL = Math.abs(rememberL-numbers[i]);
                    int absR = Math.abs(rememberR-numbers[i]);

                    int leftCount = 0;
                    int rightCount = 0;
                    //왼손거리
                    if(absL==1 || absL == 3) {
                        leftCount = 1;
                    }else if(absL/2==0) {
                        leftCount = 2;
                    }else {
                        leftCount = 3;
                    }
                    //오른손 거리
                    if(absR==1 || absR == 3) {
                        leftCount = 1;
                    }else if(absR/2==0) {
                        leftCount = 2;
                    }else {
                        leftCount = 3;
                    }
                    if(leftCount==rightCount){
                        if(hand.equals("left")){
                            answer += "L";
                            rememberL = numbers[i];
                            continue;
                        }else{
                            answer += "R";
                            rememberR = numbers[i];
                            continue;
                        }
                    }else if(leftCount<rightCount) {
                        answer += "L";
                        rememberL = numbers[i];
                        continue;
                    }else {
                        answer += "R";
                        rememberR = numbers[i];
                        continue;
                    }


                }









            }




        return null;
        //왼손잡이, 오른손잡이
        // 2 5 8 0  에서 left right 더하기 1 빼기 1 하면 가능
        // 더 가까운지는 더하기 3 빼기 3가능
        // 왼손 오른손잡이는 리멤버 쓰면 가능
        // 2, 5, 8의 경우 두 수의 차이가 짝수면 2칸 홀수면 3칸, 차이가 1이거나 3이면 한칸



    }
}
