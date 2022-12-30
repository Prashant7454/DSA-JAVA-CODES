public class TowerOfHanoi {

    public void solution(int n,int s,int d,int h){
        if(n==1){
            System.out.println("Move disk "+n+" from "+s+" to "+d);
            return;
        }

        solution(n-1,s,h,d);
        System.out.println("Move disk "+n+" from "+s+" to "+d);
        solution(n-1,h,d,s);
        return;
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.solution(n,1,3,2);
    }
}
