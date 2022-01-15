package level1;

public class Naejuck {
    public static void main(String[] args) {
    Naejuck n=new Naejuck();
    int[] a={1,2,3,4};
    int[] b={-3,-1,0,2};
        System.out.println(n.solution(a,b));


    }

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

}
