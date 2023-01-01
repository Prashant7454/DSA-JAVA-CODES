public class PalindromeNumber {

    public int reverse(int x){
        int mod = x%10;
        x = x/10;
        while(x>0){
            mod = mod*10;
            mod = mod + x%10;
            x = x/10;
        }
        return mod;
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int count = 0;
        int temp = x;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int mid = (count+1)/2;
        System.out.println(mid);
        int mod = x%((int)Math.pow(10,mid));
        int div;
        if(count%2==0){
            div = x/((int)Math.pow(10,mid));
        }
        else{
            div = x/((int)Math.pow(10,mid-1));
        }
        return mod == reverse(div);

    }
    public static void main(String[] args) {
        PalindromeNumber obj  = new PalindromeNumber();
        System.out.println(obj.isPalindrome(234432));
    }
}
