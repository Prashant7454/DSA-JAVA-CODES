public class ZigzagConversion {

    public String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for(int i = 0;i<numRows;i++){
            str[i] = "";
        }
        int j = 0;
        for(int i = 0;i<s.length();i++){
            while(j<numRows && i<s.length()){
                str[j] = str[j] + s.charAt(i);
                j++;
                i++;

            }
            j-=2;
            while(j>=0 && i<s.length()){
                str[j] = str[j] + s.charAt(i);
                j--;
                i++;
            }
            i--;
            j+=2;
        }
        String op = "";
        for(int i = 0;i<numRows;i++){
            op = op + str[i];
        }
        return op;
    }

    public static void main(String[] args) {
        ZigzagConversion obj = new ZigzagConversion();
        String ip = "PAYPALISHIRING";
        System.out.println(obj.convert(ip,4));
    }
}
