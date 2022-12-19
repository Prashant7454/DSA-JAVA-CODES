import java.util.Stack;

public class MinStackWithO1Space {

    Stack<Integer> s = new Stack<>();
    int minEle;

    public int minElement(){
        if(s.empty()){
            return -1;
        }
        else{
            return minEle;
        }
    }

    public void sPush(int a){
        if(s.empty()){
            s.push(a);
            minEle = a;
        }
        else{
            if(a>=minEle){
                s.push(a);
            }
            else if(a<minEle){
                s.push(2*a-minEle);
                minEle = a;
            }
        }
    }

    public int sTop(){
        if(s.empty()){
            return -1;
        }
        else if(s.peek()>=minEle){
            return s.peek();
        }
        else{
            return minEle;
        }
    }

    public void sPop(){
        if(s.empty()){

        }
        else if(s.peek()>=minEle){
            s.pop();
        }
        else{
            minEle = 2*minEle - s.peek();
            s.pop();
        }
    }

    public static void main(String[] args) {
        MinStackWithO1Space m = new MinStackWithO1Space();

        m.sPush(5);
        System.out.println(m.minElement());
        System.out.println(m.sTop());
        m.sPush(3);
        System.out.println(m.minElement());
        System.out.println(m.sTop());
        m.sPush(6);
        System.out.println(m.minElement());
        System.out.println(m.sTop());
        m.sPush(8);
        System.out.println(m.minElement());
        System.out.println(m.sTop());
        m.sPush(2);
        System.out.println(m.minElement());
        System.out.println(m.sTop());
        m.sPop();
        System.out.println(m.minElement());
        System.out.println(m.sTop());

    }
}
