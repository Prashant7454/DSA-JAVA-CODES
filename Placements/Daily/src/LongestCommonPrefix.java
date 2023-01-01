import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String check = strs[0];
        String op = "";
        boolean bool = true;
        for(int i = 0;i<strs.length-1;i++){
            if(check==""){
                return "";
            }
            op ="";
            for(int j =0;j<check.length();j++){
                if(check.charAt(j)==strs[i+1].charAt(j)){
                    op = op + check.charAt(j);
                }
                else {
                    check = op;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] str = {"a","b"};
        System.out.println(obj.longestCommonPrefix(str));
    }
}
