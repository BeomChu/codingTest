package level1;

public class Keypad2 {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i=0; i<numbers.length;i++){
        }

        return answer;
    }

    public String takeHand(int i, int left, int right,String hand){
        switch (i){
            case 1: case 4: case 7:
                return "L";
            case 3: case 6: case 9:
                return "R";
            case 2: case 5: case 8: case 0:
                int l = count(Math.abs(left-i));
                int r = count(Math.abs(right-i));

                if(i==0){
                    l+=1;
                    r+=1;
                }

                if(l==r){
                    if(hand.equals("left")){
                        return "L";
                    }else{
                        return "R";
                    }
                }else if(count(l)<count(r)){
                    return "L";
                }else{
                    return "R";
                }
        }
        return "틀렸따";
    }
    public int count(int i){
        if(i-1 == 0 || i-3 == 0){
            return 1;
        }else if(i/2 == 0){
            return 2;
        }else{
            return 3;
        }
    }

}
