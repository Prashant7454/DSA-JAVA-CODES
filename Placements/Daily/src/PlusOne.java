public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits.length==0){
            int[] arr = {1};
            return arr;
        }
        int l = digits.length-1;
        while(l>=0&&digits[l]==9){
            digits[l]=0;
            l--;
        }
        if(l==-1){
            int[] arr = new int[digits.length+1];
            for(int i = arr.length-1;i>0;i--){
                arr[i] = digits[i-1];
            }
            arr[0] = 1;
            return arr;
        }
        else{
            digits[l] = digits[l] + 1;
            return digits;
        }
    }

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] arr = {};
        int[] op = obj.plusOne(arr);
        for(int i = 0;i<op.length;i++){
            System.out.print(op[i] + " ");
        }
    }
}
