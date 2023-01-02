public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        if(p == ".*"){
            return true;
        }
        int ls = s.length();
        int lp = p.length();
        int i = 0;
        int j = 0;
        boolean bool = true;

        while(i<ls && j<lp){
            if(s.charAt(i)==p.charAt(j)){
                System.out.println("1");
                i++;
                j++;
            }
            else if(p.charAt(j)=='.'&&p.charAt(j+1)=='*'){
                System.out.println("2");
                while(i<ls-1&&s.charAt(i)==s.charAt(++i));
                j+=2;
            }
            else if(p.charAt(j)=='.'){
                j++;
                i++;
            }
            else if(p.charAt(j)=='*'){
                System.out.println("3");
                while(i<ls-1&&s.charAt(i)==s.charAt(++i)){
                    System.out.println("0");
                }
                j++;
                if(i==ls-1){
                    i++;
                }
            }
            else if(ls<lp){
                System.out.println("4");
                j++;
            }
            else{
                System.out.println("5");
                bool = false;
                break;
            }
        }
        if(i!=ls){
            bool = false;
        }
        return bool;
    }

    public static void main(String[] args) {
        RegularExpressionMatching obj = new RegularExpressionMatching();
        System.out.println(obj.isMatch("ab",".*"));
    }}
