public class RainWaterTrapping {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;

        int mxl[] = new int[n];
        int mxr[] = new int[n];

        mxl[0] = arr[0];
        for(int i = 1;i<n;i++){
            mxl[i] = Math.max(mxl[i-1],arr[i]);
        }

        mxr[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            mxr[i] = Math.max(mxr[i+1],arr[i]);
        }

        int water[] = new int[n];
        int sum = 0;

        for(int i = 0;i<n;i++){
            water[i] = Math.min(mxl[i],mxr[i]) - arr[i];
            sum = sum + water[i];
        }

        System.out.println("Maximum Water Trapped = " + sum);
    }
}
