import java.util.Stack;

public class ReverseAnArray {

    public void insert(Stack<Integer> s1 ,int val){
        if(s1.isEmpty()){
            s1.push(val);
            return;
        }
        int temp = s1.peek();
        s1.pop();
        insert(s1,val);
        s1.push(temp);
    }

    public void reverse(Stack<Integer> s1){
        if(s1.size()==1){
            return;
        }
        int temp = s1.peek();
        s1.pop();
        reverse(s1);
        insert(s1,temp);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(1);
        stack.push(8);
        stack.push(6);
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
        ReverseAnArray obj = new ReverseAnArray();
        obj.reverse(stack);
        System.out.println(stack);
    }
}
