import java.util.Stack;

public class MinStackWithExtraSpace {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();

    public void sPush(int a){
        s.push(a);
        if(ss.empty() || ss.peek() >= a){
            ss.push(a);
        }
    }

    public int sPop(){
        if(s.empty()){
            return -1;
        }
        int ans = s.peek();
        s.pop();
        if(ans==ss.peek()){
            ss.pop();
        }
        return ans;
    }

    public int minElement(){
        if(ss.empty()){
            return -1;
        }
        return ss.peek();
    }


    public static void main(String[] args) {
         MinStackWithExtraSpace m = new MinStackWithExtraSpace();
         m.sPush(18);
         System.out.println(m.minElement());
         m.sPush(19);
        System.out.println(m.minElement());
         m.sPush(29);
        System.out.println(m.minElement());
         m.sPush(15);
        System.out.println(m.minElement());
         m.sPop();
        System.out.println(m.minElement());
         m.sPush(16);
        System.out.println(m.minElement());
    }
}
