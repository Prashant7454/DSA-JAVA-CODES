import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List<String> l1 = new ArrayList<>();

            return l1;
        }

        String [] com = new String[digits.length()];
        for(int i = 0;i<digits.length();i++){
            char c = digits.charAt(i);
            switch (c){
                case '1' :
                    break;
                case '2' :
                    com[i] = "abc";
                    break;
                case '3' :
                    com[i] = "def";
                    break;
                case '4' :
                    com[i] = "ghi";
                    break;
                case '5' :
                    com[i] = "jkl";
                    break;
                case '6' :
                    com[i] = "mno";
                    break;
                case '7' :
                    com[i] = "pqrs";
                    break;
                case '8' :
                    com[i] = "tuv";
                    break;
                case '9' :
                    com[i] = "wxyz";
                    break;
                case '0' :
                    com[i] = " ";
                    break;
            }
        }
        if(digits.length()==1){
            List<String > l1 = new ArrayList<>();
            for(int i = 0;i<com[0].length();i++){
                l1.add(String.valueOf(com[0].charAt(i)));
            }
            return l1;
        }

        List<String > l1 = new ArrayList<>();
        l1.add("");
        for(int i =0;i<digits.length();i++){
            List<String > l2 = new ArrayList<>();
            for(int j = 0;j<l1.size();j++){
                for(int k = 0;k<com[i].length();k++){
                    l2.add(l1.get(j)+com[i].charAt(k));
                }
            }
            l1 = l2;
        }
        return l1;
    }

    public static void main(String[] args) {
        LetterCombinationOfPhoneNumber obj = new LetterCombinationOfPhoneNumber();
        List<String > l  = obj.letterCombinations("205");
        System.out.println(l);
    }
}
