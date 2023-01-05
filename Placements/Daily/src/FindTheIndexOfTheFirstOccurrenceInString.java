public class FindTheIndexOfTheFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 || needle.length()==0 || needle.length()>haystack.length()){
            return -1;
        }
        int needleSize = needle.length();
        for(int i = 0;i<=haystack.length()-needle.length();i++){
            String check = haystack.substring(i,needleSize+i);
            if(check.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInString obj = new FindTheIndexOfTheFirstOccurrenceInString();
        System.out.println(obj.strStr("sdbutsad","sad"));
    }
}
