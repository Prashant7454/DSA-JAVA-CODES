import java.util.Stack;

public class DeleteMiddleElement {
    public void delete(Stack<Integer> s1,int k){
        if(k==1){
            s1.pop();
            return ;
        }
        int temp = s1.pop();
        delete(s1,k-1);
        s1.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(8);
        s1.push(9);
        s1.push(7);
        s1.push(4);
        System.out.println(s1);
        DeleteMiddleElement obj = new DeleteMiddleElement();
        int k = (s1.size()/2)+1;
        obj.delete(s1,k);
        System.out.println(s1);
    }
}
