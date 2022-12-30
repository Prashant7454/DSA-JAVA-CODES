import java.util.Objects;

public class PermutationWithSpace {
    public void solution(String op,String ip){
        if(Objects.equals(ip, "")){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 = op1 + " " + ip.charAt(0);
        op2 = op2 + ip.charAt(0);
        String temp = "";
        for(int i = 1;i<ip.length();i++){
            temp = temp + ip.charAt(i);
        }
        solution(op1,temp);
        solution(op2,temp);
    }
    public static void main(String[] args) {
        PermutationWithSpace obj = new PermutationWithSpace();
        obj.solution("A","BCDE");
    }
}
