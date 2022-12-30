public class KthSymbolInGrammar {

    public boolean solve(int n,int k){
        if(n==1&&k==1){
            return false;
        }
        int mid = (int) Math.pow(2,n-1);
        if(k<=mid){
            return solve(n-1,k);
        }
        else{
            return !solve(n-1,k-mid);
        }
    }

    public static void main(String[] args) {
        KthSymbolInGrammar obj = new KthSymbolInGrammar();
        System.out.println(obj.solve(4,5));
    }
}
