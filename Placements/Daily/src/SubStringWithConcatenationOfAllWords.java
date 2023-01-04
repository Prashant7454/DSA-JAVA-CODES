import java.util.*;

public class SubStringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int len = 0, wordLength = words[0].length();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
            len += word.length();
        }

        List<Integer> indices = new ArrayList<>();
        int times = s.length() - len;
        for (int i = 0; i <= times; i++) {
            if (map.isEmpty()) {
                for (String word : words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            String sub = s.substring(i, i + len);
            int count = 0;
            while (count < words.length) {
                String word = sub.substring(0, wordLength);
                Integer freq = map.get(word);
                if (freq != null && freq > 0) {
                    map.put(word, freq - 1);
                    sub = sub.substring(wordLength);
                    count++;
                } else break;
            }
            if (count == words.length) {
                indices.add(i);
            }
            map.clear();
        }
        return indices;
    }

    public static void main(String[] args) {
        SubStringWithConcatenationOfAllWords obj = new SubStringWithConcatenationOfAllWords();
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        List<Integer > l1 = obj.findSubstring(s,words);
        System.out.println(l1);
    }
}
