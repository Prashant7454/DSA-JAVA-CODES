public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        for(int i = 0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] arr = {1,3,5,6};
        System.out.println(obj.searchInsert(arr,0));
    }
}
