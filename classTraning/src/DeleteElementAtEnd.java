public class DeleteElementAtEnd {

    public int pop(int arr[]){

        int i = 0;
        for(i = 0;i<arr.length;i++){
            if(arr[i]==-1){
                break;
            }
        }
        i = i - 1;
        if(i<0){
            System.out.println("UnderFlow Error");
            return -1;
        }
        int delete = arr[i];
        arr[i] = -1;
        return delete;
    }

    public static void main(String[] args) {
        DeleteElementAtEnd obj = new DeleteElementAtEnd();
        int arr[] = {12,23,34,56,67,88,65};
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        System.out.println(obj.pop(arr));
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
