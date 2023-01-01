import java.util.Arrays;

public class MedianOfTowSortedArray {

    public int[] marge(int[] nums1,int[] nums2){
        int[] arr = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(j<nums1.length){
            arr[i]= nums1[j];
            i++;
            j++;
        }
        while (k<nums2.length){
            arr[i] = nums2[k];
            k++;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = marge(nums1,nums2);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        double op = (double) (arr[arr.length/2-1]+arr[arr.length/2])/2;
        return op;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        MedianOfTowSortedArray obj = new MedianOfTowSortedArray();
        System.out.println(obj.findMedianSortedArrays(arr1,arr2));
    }
}
