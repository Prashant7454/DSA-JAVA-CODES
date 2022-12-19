import java.util.Stack;
import java.util.Vector;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            if(s.empty()){
                v.add(-1);
            }
            else if(s.size()>0 && s.peek()>arr[i]){
                v.add(s.peek());
            }
            else if(s.size()>0 && s.peek()<=arr[i]){
                while(s.size()>0 && s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.empty()){
                    v.add(-1);
                }
                else{
                    v.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        System.out.println(v);
    }
}
