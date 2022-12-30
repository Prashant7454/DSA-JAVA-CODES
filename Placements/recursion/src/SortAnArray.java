
import java.util.ArrayList;
public class SortAnArray {

    public void insert(ArrayList<Integer> l1,int val){
        if(l1.isEmpty()){
            l1.add(val);
            return;
        }
        if(l1.get(l1.size()-1)<=val){
            l1.add(val);
            return;
        }
        int temp = l1.get(l1.size()-1);
        l1.remove(l1.size()-1);
        insert(l1,val);
        l1.add(temp);
    }

    public void sort(ArrayList<Integer> l1){
        if(l1.isEmpty()){
            return;
        }
        int val = l1.get(l1.size()-1);
        l1.remove(l1.size()-1);
        sort(l1);
        insert(l1,val);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        SortAnArray obj = new SortAnArray();
        obj.sort(arr);
        System.out.println(arr);
    }
}
