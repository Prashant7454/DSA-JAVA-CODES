import java.util.Objects;

public class PermutationWithCaseChange {
    public void solution(String op,String ip){
        if(Objects.equals(ip,"")){
            System.out.println(op);
            return;
        }
        if(ip.charAt(0)=='1'||ip.charAt(0)=='2'||ip.charAt(0)=='3'||ip.charAt(0)=='4'||ip.charAt(0)=='5'||ip.charAt(0)=='6'||ip.charAt(0)=='7'||ip.charAt(0)=='8'||ip.charAt(0)=='9'||ip.charAt(0)=='0'){
            op  = op + ip.charAt(0);
            String temp  = "";
            for(int i = 1;i<ip.length();i++){
                temp = temp + ip.charAt(i);
            }
            solution(op,temp);

        }
        else{
            String op1 = op;
            String op2 = op;

            op1  = op1 + ip.toLowerCase().charAt(0);
            op2 = op2 + ip.toUpperCase().charAt(0);
            StringBuilder tempBuilder = new StringBuilder();
            for(int i = 1; i<ip.length(); i++){
                tempBuilder.append(ip.charAt(i));
            }
            String temp = tempBuilder.toString();
            solution(op1,temp);
            solution(op2,temp);
        }

    }

    public static void main(String[] args) {
        PermutationWithCaseChange obj = new PermutationWithCaseChange();
        obj.solution("","A1B2");
    }
}
