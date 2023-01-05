public class BinaryAdd {

    public String addBinary(String a, String b) {
        StringBuilder op = new StringBuilder();
        if(a.length()==0&&b.length()==0){
            return op.toString();
        }
        if(a.length()==0){
            return b;
        }
        if(b.length()==0){
            return a;
        }
        char carry = '0';
        int aLength = a.length();
        int bLength = b.length();
        int i = aLength-1;
        int j = bLength-1;
        while(i>=0&&j>=0){
            System.out.println(i + " " + j);
            if(a.charAt(i)=='0' &&b.charAt(j)=='0' && carry=='0'){
                op.append('0');
                i--;
                j--;
                continue;
            }
            if(a.charAt(i)=='0' &&b.charAt(j)=='0' && carry=='1'){
                op.append('1');
                carry = '0';
                i--;
                j--;
                continue;
            }
            if((a.charAt(i)=='1' && b.charAt(j)=='0' && carry=='0') || (a.charAt(i)=='0' && b.charAt(j)=='1' && carry=='0')){
                op.append('1');
                i--;
                j--;
                continue;
            }
            if((a.charAt(i)=='1' && b.charAt(j)=='0' && carry=='1') || (a.charAt(i)=='0' && b.charAt(j)=='1' && carry=='1')){
                op.append('0');
                i--;
                j--;
                continue;
            }
            if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=='0'){
                op.append('0');
                carry = '1';
                i--;
                j--;
                continue;
            }
            if(a.charAt(i)=='1' && b.charAt(j)=='1' && carry=='1'){
                op.append('1');
                i--;
                j--;
            }
        }
        if(i>=0){
            while (i>=0){
                if(carry=='0'){
                    op.append(a.charAt(i));
                    i--;
                    continue;
                }
                if(a.charAt(i)=='1'){
                    op.append('0');
                    i--;
                    continue;
                }
                if(a.charAt(i)=='0'){
                    op.append('1');
                    carry = '0';
                    i--;
                }
            }
        }
        if(j>=0){
            while (j>=0){
                if(carry=='0'){
                    op.append(b.charAt(j));
                    j--;
                    continue;
                }
                if(b.charAt(j)=='1'){
                    op.append('0');
                    j--;
                    continue;
                }
                if(b.charAt(j)=='0'){
                    op.append('1');
                    carry = '0';
                    j--;
                }
            }
        }
        if(carry=='1'){
            op.append('1');
        }
        op.reverse();
       return op.toString();
    }

    public static void main(String[] args) {
        BinaryAdd obj = new BinaryAdd();
        System.out.println(obj.addBinary("1111","1111"));
    }
}
