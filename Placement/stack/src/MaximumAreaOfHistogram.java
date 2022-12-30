//import javafx.util.Pair;
//
//import java.util.Stack;
//
//public class MaximumAreaOfHistogram {
//    public int[] nearestSmallerToLeft(int[] arr){
//        int[] v = new int[arr.length];
//        Stack<Pair <Integer,Integer>> s = new Stack<>();
//
//        for(int i = 0;i<arr.length;i++){
//            if(s.empty()){
//                v[i] = -1;
//            }
//            else if(s.size()>0 && s.peek().getKey()<arr[i]){
//                v[i] = s.peek().getValue();
//            }
//            else if(s.size()>0 && s.peek().getKey()>=arr[i]){
//                while(s.size()>0 && s.peek().getKey()>=arr[i]){
//                    s.pop();
//                }
//                if(s.empty()){
//                    v[i] = -1;
//                }
//                else{
//                    v[i] = s.peek().getValue();
//                }
//            }
//            Pair<Integer,Integer> p = new Pair<>(arr[i],i);
//            s.push(p);
//        }
//        return v;
//    }
//
//    public int[] nearestSmallerToRight(int[] arr){
//        int[] v = new int[arr.length];
//        Stack<Pair<Integer,Integer>> s = new Stack<>();
//
//        for(int i = arr.length-1;i>=0;i--){
//            if(s.empty()){
//                v[i] = arr.length;
//            }
//            else if(s.size()>0 && s.peek().getKey()<arr[i]){
//                v[i] = s.peek().getValue();
//            }
//            else if(s.size()>0 && s.peek().getKey()>=arr[i]){
//                while(s.size()>0 && s.peek().getKey()>=arr[i]){
//                    s.pop();
//                }
//                if(s.empty()){
//                    v[i] = arr.length;
//                }
//                else{
//                    v[i] = s.peek().getValue();
//                }
//            }
//            Pair<Integer,Integer> p = new Pair<>(arr[i],i);
//            s.push(p);
//        }
//        return v;
//    }
//    public static void main(String[] args) {
//        int[] arr = {6,2,5,4,5,1,6};
//        MaximumAreaOfHistogram m = new MaximumAreaOfHistogram();
//        int n = arr.length;
//        int[] right = m.nearestSmallerToRight(arr);
//        int[] left = m.nearestSmallerToLeft(arr);
//        int[] width = new int[n];
//        int[] area = new int[n];
//        int maxArea = 0;
//
//        for(int i = 0 ;i < arr.length;i++){
//            width[i] = right[i] - left[i] - 1;
//            area[i] = width[i] * arr[i];
//            if(maxArea<=area[i]){
//                maxArea = area[i];
//            }
//        }
//        for(int i = 0;i<area.length;i++){
//            System.out.println(area[i]);
//        }
//        System.out.println("maximum area = " + maxArea);
//    }
//}
