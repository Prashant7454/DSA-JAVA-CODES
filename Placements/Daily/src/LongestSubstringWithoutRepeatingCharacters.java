import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if(s==""){
            return 0;
        }
        int maxcount = 0;
        int count = 0;
        Map<Character,Integer> m1 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(m1.containsKey(s.charAt(i))){
                int pos = m1.get(s.charAt(i));
                i = pos+1;
                m1.clear();
                m1.put(s.charAt(i),i);
                count = 1;
            }
            else{
                m1.put(s.charAt(i),i);
                count++;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
    }
}
