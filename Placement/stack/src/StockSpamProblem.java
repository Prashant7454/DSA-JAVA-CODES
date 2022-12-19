import javafx.util.Pair;
import java.util.Stack;
import java.util.Vector;

public class StockSpamProblem {
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        Vector<Integer> v = new Vector<>();
        Stack<Pair <Integer,Integer>> s = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            if(s.empty()){
                v.add(i-(-1));
            }
            else if(s.size()>0 && s.peek().getKey()>arr[i]){
                v.add(i-s.peek().getValue());
            }
            else if(s.size()>0 && s.peek().getKey()<=arr[i]){
                while(s.size()>0 && s.peek().getKey()<=arr[i]){
                    s.pop();
                }
                if(s.empty()){
                    v.add(i-(-1));
                }
                else{
                    v.add(i-s.peek().getValue());
                }
            }
            Pair<Integer,Integer> p = new Pair<>(arr[i],i);
            s.push(p);
        }
        System.out.println(v);
    }
}
