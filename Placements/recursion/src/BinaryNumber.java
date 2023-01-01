public class BinaryNumber {

    public void solution(String op,int one,int zero,int ip){
        if(ip==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        op1 += "1";
        solution(op1,one+1,zero,ip-1);
        if(one>zero){
            String op2 = op;
            op2 += "0";
            solution(op2,one,zero+1,ip-1);
        }
    }

    public static void main(String[] args) {
        BinaryNumber obj = new BinaryNumber();
        obj.solution("",0,0,5);
    }
}
