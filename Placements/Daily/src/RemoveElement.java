public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int count = 0;
        int j = nums.length-1;
        int l = nums.length;
        for(int i=0;i<l;i++){
            if(val==nums[i]){
                count++;
                while(j>i&&nums[j]==val){
                    j--;
                    l--;
                    count++;
                }
                if(j<0){
                    break;
                }
                nums[i] = nums[j];
                j--;
                l--;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        RemoveElement obj= new RemoveElement();
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(obj.removeElement(arr,2));
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
