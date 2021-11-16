package level1;

public class Nonumber {
    public static void main(String[] args) {
        Nonumber n = new Nonumber();
        int[] a={1,2,3,4,6,7,8,0};
        System.out.println(n.solution(a));

    }

    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i<numbers.length;i++){
            answer-=numbers[i];
        }


        return answer;
    }
}
