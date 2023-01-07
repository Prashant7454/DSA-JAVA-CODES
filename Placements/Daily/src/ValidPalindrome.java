public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return false;
        }
        if(s.length()==1){
            return true;
        }
        String c = "";
        s = s.toLowerCase();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch<='z'&&ch>='a'|| ch>='0' && ch<='9'){
                c = c + ch;
            }
        }

        int l = c.length();

        if(l%2==0){
            System.out.println((l-1)/2);
            return extendPalindrome(c,(l-1)/2,(l-1)/2+1);
        }
        else{
            return extendPalindrome(c,(l)/2,(l)/2);
        }
    }

    private boolean extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length()) {
            System.out.println(s.charAt(j) + " " + s.charAt(k));
            if(s.charAt(j) != s.charAt(k)){
                return false;
            }
            j--;
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome("race a car"));
    }
}
