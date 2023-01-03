public class ReverseInteger {

    public int reverse(int x){
        if(x<0){
            if(x<=-2147483648){
                return 0;
            }
            x = -x;
            int mod = x%10;
            x = x/10;
            while(x>0){
                long check = mod;
                if(check*10>2147483647){
                    return 0;
                }
                mod = mod*10;
                mod = mod + x%10;
                x = x/10;
            }
            return -mod;
        }
        int mod = x%10;
        x = x/10;
        while(x>0){
            long check = mod;
            if(check*10>2147483647){
                return 0;
            }
            mod = mod*10;
            System.out.println(mod);
            mod = mod + x%10;
            x = x/10;
        }
        return mod;
    }


    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(-2147483648));
    }
}
