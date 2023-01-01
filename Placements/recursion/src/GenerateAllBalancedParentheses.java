import java.awt.*;

public class GenerateAllBalancedParentheses {

    public void solution(String op,int open,int close){
        if(open==0&&close==0){
            System.out.println(op);
            return;
        }
        if (open != 0) {
            String op1 = op;
            op1 += "{";
            solution(op1,open-1,close );
        }
        if(close>open){
            String op2 = op;
            op2 += "}";
            solution(op2,open,close-1);
        }
    }

    public static void main(String[] args) {
        GenerateAllBalancedParentheses obj = new GenerateAllBalancedParentheses();
        obj.solution("",3,3);

    }
}
