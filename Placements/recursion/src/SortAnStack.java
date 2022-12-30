import java.util.Stack;

public class SortAnStack {
    public void insert(Stack<Integer> l1, int val){
        if(l1.isEmpty()){
            l1.push(val);
            return;
        }
        if(l1.peek()<=val){
            l1.add(val);
            return;
        }
        int temp = l1.peek();
        l1.pop();
        insert(l1,val);
        l1.push(temp);
    }

    public void sort(Stack<Integer> l1){
        if(l1.isEmpty()){
            return;
        }
        int val = l1.peek();
        l1.pop();
        sort(l1);
        insert(l1,val);
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
        SortAnStack obj  = new SortAnStack();
        obj.sort(stack);
        System.out.println(stack);
    }
}
