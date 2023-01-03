public class StringToInteger {

    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        boolean bool = true;
        boolean signCheck = true;
        int op = 0;
        for(int i = 0 ;i<s.length();i++){
            char check = s.charAt(i);
            switch(check){
                case '1' :
                    long c1 = (long)op*10+1;
                    if(c1>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;

                    }
                    op = op*10 + 1;
                    break;
                case '2' :
                    long c2 = (long) op*10+2;
                    if(c2>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 2;
                    break;
                case '3' :
                    long c3 = (long) op*10+3;
                    if(c3>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 3;
                    break;
                case '4' :
                    long c4 = (long) op*10+4;
                    if(c4>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 4;
                    break;
                case '5' :
                    long c5 = (long)op*10+5;
                    if(c5>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 5;
                    break;
                case '6' :
                    long c6 = (long) op*10+6;
                    if(c6>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 6;
                    break;
                case '7' :
                    long c7 = (long) op*10+7;
                    if(c7>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 7;
                    break;
                case '8' :
                    long c8 = (long) op*10+8;
                    if(c8>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 8;
                    break;
                case '9' :
                    long c9 = (long) op*10+9;
                    if(c9>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 9;
                    break;
                case '0' :
                    long c = (long) op*10;
                    if(c>Integer.MAX_VALUE){
                        op = Integer.MAX_VALUE;
                        return bool?op:-op-1;
                    }
                    op = op*10 + 0;
                    break;
                case '-' :
                    if(!signCheck){
                        return bool?op:-op;
                    }
                    if(op==0){
                        bool = false;
                    }
                    signCheck = false;
                    break;
                case '+':
                    if(!signCheck){
                        return bool?op:-op;
                    }
                    if(op!=0){
                        return bool?op:-op;
                    }
                    signCheck = false;
                    break;
                case ' ':
                    if(op!=0){
                        return bool?op:-op;
                    }
                    break;
                default:
                    return bool?op:-op;
            }
        }
        return bool?op:-op;
    }

    public static void main(String[] args) {
        StringToInteger obj = new StringToInteger();
        System.out.println(obj.myAtoi("-2147483647"));
    }
}
