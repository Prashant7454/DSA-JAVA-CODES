public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int l = s.length()-1;
        int count = 0;
        while (l>=0){
            System.out.println(s.charAt(l));
            if(s.charAt(l)==' '){
                if(count==0){
                    l--;
                    continue;
                }
                break;
            }
            count++;
            l--;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord(""));
    }
}
