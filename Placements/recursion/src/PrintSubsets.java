public class PrintSubsets {

    public void print(String op,String ip){
        if(ip==""){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2 = op2 + ip.charAt(0);
        String temp = "";
            for(int i = 1;i<ip.length();i++){
                temp = temp + ip.charAt(i);
            }
        print(op1,temp);
        print(op2,temp);
    }

    public static void main(String[] args) {
        PrintSubsets obj = new PrintSubsets();
        obj.print(" ","abcef");
    }
}
