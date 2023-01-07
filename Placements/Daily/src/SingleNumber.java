import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        Map<Integer,Integer> s1 = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(s1.containsKey(nums[i])){
                s1.put(nums[i],s1.get(nums[i])+1);
            }
            else{
                s1.put(nums[i],1);
            }
        }
        int op = -1;
        for(int i = 0;i<nums.length;i++){
            if(s1.get(nums[i])==1){
                op = nums[i];
                break;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(arr));
    }
}
