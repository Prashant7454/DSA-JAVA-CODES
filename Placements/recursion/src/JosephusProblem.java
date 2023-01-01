import java.util.ArrayList;

public class JosephusProblem {

    public int solution(ArrayList<Integer> a1,int k,int pos){
        if(a1.size()==1){
            return a1.get(0);
        }
        if((pos+k-1)>=a1.size()){
            int index = (pos+k-1)%a1.size();
            a1.remove(index);
            solution(a1,k,index);
        }
        else {
            int index = pos + k - 1;
            a1.remove(index);
            solution(a1,k,index);
        }
        return a1.get(0);
    }

    public static void main(String[] args) {
        JosephusProblem obj = new JosephusProblem();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        System.out.println(obj.solution(a1,2,0));
    }
}
