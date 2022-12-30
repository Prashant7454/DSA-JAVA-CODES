import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NearestGreaterToRight {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
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

        Collections.reverse(v);

        System.out.println(v);

    }
}
