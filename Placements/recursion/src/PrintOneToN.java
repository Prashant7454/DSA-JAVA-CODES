public class PrintOneToN {
    public void print(int n){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        PrintOneToN obj  = new PrintOneToN();
        obj.print(n);
    }
}
