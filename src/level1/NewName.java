package level1;

public class NewName {
    public static void main(String[] args) {
        NewName a=new NewName();
        String new_id="abcdefghijklmn.p";
        System.out.println(a.solution(new_id));
    }



    public String solution(String new_id) {
        String answer = "";
        String check="";
        //첫번째과정
        for(int i=0;i<new_id.length();i++){
            if(Character.isUpperCase(new_id.charAt(i))){
                check+=Character.toLowerCase(new_id.charAt(i));
            }else{
                check+=new_id.charAt(i);
            }
        }
        answer=check;
        check="";

        //두번째과정
        for (char c : answer.toCharArray()) {
            if(c=='.'||c=='-'||c=='_'||Character.isDigit(c)||Character.isLowerCase(c)){
                check+=c;
            }
        }
        answer=check;
        check="";
        //3번째
        while(answer.contains("..")){
            answer = answer.replace("..", ".");
        }

        //4번째

        if(answer.charAt(0)=='.'){
            String substring = answer.substring(1);
            answer=substring;
        }


        if(answer.length()!=0&&answer.charAt(answer.length()-1)=='.'){
            String substring2 =answer.substring(0, answer.length() - 1);
            answer=substring2;
        }

        //5단계

        if(answer.equals("")){
            answer="a";
        }

        //6단계
        if(answer.length()>15){
            answer=answer.substring(0,15);
            if(answer.charAt(14)=='.'){
                answer= answer.substring(0,14);
            }
        }
        //7단계

        if(answer.length()<3) {
            answer += answer.charAt(answer.length() - 1);
            if (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);

            }
        }





        return answer;
    }
}
