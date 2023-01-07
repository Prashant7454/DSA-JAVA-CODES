import java.util.Set;

public class SearchInRotatedSortedArray {

    public int binarySearch(int[] arr,int x,int l,int r){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr,x, l, mid - 1);
            return binarySearch(arr, x,mid + 1, r);
        }
            return -1;
    }

    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        if(nums[0]<nums[nums.length-1]){
            return binarySearch(nums,target,0,nums.length-1);
        }
        int mid = (nums.length+1)/2-1;
        if(target>=nums[0]){
            if(target==nums[mid]){
                return mid;
            }
            if(nums[0]<=nums[mid] && target>nums[mid]){
                int i = mid;
                while(i<nums.length){
                    if(target==nums[i]){
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            else if(nums[0]>nums[mid] && target>nums[mid]){
                int i = mid;
                while(i>=0){
                    if(target==nums[i]){
                        return i;
                    }
                    i--;
                }
                return -1;
            }
            else {
                int i = mid;
                while (i>=0){
                    if(target==nums[i]){
                        return i;
                    }
                    i--;
                }
                return -1;
            }
        }
        else {
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid] && nums[mid]>nums[0]){
                int i = mid;
                while(i<nums.length){
                    if(target==nums[i]){
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            else if(target<nums[mid] && nums[mid]<nums[0]){
                int i = mid;
                while(i>=0){
                    if(target==nums[i]){
                        return i;
                    }
                    i--;
                }
                return -1;
            }
            else{
                int i = mid;
                while(i<nums.length){
                    if(target==nums[i]){
                        return i;
                    }
                    i++;
                }
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        int[] arr = {3,5,1};
        System.out.println(obj.search(arr,3));
    }
}
