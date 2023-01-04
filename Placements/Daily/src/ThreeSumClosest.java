import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3){
            return -1;
        }
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        }
        Arrays.sort(nums);
        int i;
        i = 0;
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        while(i<nums.length-2 ){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                if(sum>target){
                    right = Math.min(right,sum);
                }
                if(sum<target){
                    left = Math.max(left,sum);
                }
                if(sum <= target) while(nums[j] == nums[++j] && j < k);
                if(sum >= target) while(nums[k--] == nums[k] && j < k);

            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        if((long)target-left<(long) right-target){
            return left;
        }
        else {
            return right;
        }
    }

    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] arr = {1,1,1,1};
        System.out.println(obj.threeSumClosest(arr,0));
    }
}
