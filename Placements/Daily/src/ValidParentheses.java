import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> s1 =new Stack<>();
        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='['||s.charAt(i)=='('){
                s1.push(s.charAt(i));
            }
            else {
                if(s1.isEmpty()){
                    return false;
                }
                char check = s1.peek();
                switch(check){
                    case '[':
                        if(']'!=s.charAt(i)){
                            return false;
                        }
                        s1.pop();
                        break;
                    case '{':
                        if('}'!=s.charAt(i)){
                            return false;
                        }
                        s1.pop();
                        break;
                    case '(':
                        if(')'!=s.charAt(i)){
                            return false;
                        }
                        s1.pop();
                        break;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("{[]}()"));
    }
}
