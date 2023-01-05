import java.util.*;

public class GenerateAllBalancedParentheses {
    List<String> l = new ArrayList<>();
    public void solution(String op,int open,int close){
        if(open==0&&close==0){
            l.add(op);
            return;
        }
        if (open != 0) {
            String op1 = op;
            op1 += "(";
            solution(op1,open-1,close );
        }
        if(close>open){
            String op2 = op;
            op2 += ")";
            solution(op2,open,close-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        solution("",n,n);
        return l;
    }

    public static void main(String[] args) {
        GenerateAllBalancedParentheses obj = new GenerateAllBalancedParentheses();
        List<String> l1 = obj.generateParenthesis(3);
        System.out.println(l1);

    }
}
