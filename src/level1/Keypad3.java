package level1;

import java.util.HashMap;
import java.util.Map;

public class Keypad3 {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l=0;
        int r=0;

        for (int i : numbers) {
            if(i%3==0){
                answer+="R";
                r=i;
            }else if(i%3==1){
                answer+="L";
                l=i;
            }else{

                if(i==0)
                    i=11;

                int lCount = count(Math.abs(l-i));
                int rCount = count(Math.abs(r-i));


                if(lCount==rCount){
                    if(hand.equals("left")){
                        answer+= "L"; l=i;
                    }else{
                        answer+= "R"; r=i;
                    }
                }else if(lCount<rCount){
                    answer+= "L"; l=i;
                }else{
                    answer+= "R"; r=i;
                }
            }
        }
        return answer;
    }

    public int count(int i) {
        if(i==10||i==8){
            return 4;
        }else if(i-1 == 0 || i-3 == 0){
            return 1;
        }else if(i/2 == 0){
            return 2;
        }else{
            return 3;


        }
    }



}
