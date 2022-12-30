//import javafx.util.Pair;
//
//import java.util.Stack;
//
//public class MaxAreaRectangleInBinaryMatrix {
//
//    public int[] nearestSmallerToLeft(int[] arr){
//        int[] v = new int[arr.length];
//        Stack<Pair<Integer,Integer>> s = new Stack<>();
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
//
//    public int MAH(int[] arr){
//        MaxAreaRectangleInBinaryMatrix m = new MaxAreaRectangleInBinaryMatrix();
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
//        return maxArea;
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = {
//                        {0,1,1,0},
//                        {1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,0,0}
//                      };
//        int n = arr.length;
//        int m = arr[0].length;
//        int[] v = new int[m];
//
//        for(int j = 0;j<m;j++){
//            v[j]=arr[0][j];
//        }
//        MaxAreaRectangleInBinaryMatrix m1 = new MaxAreaRectangleInBinaryMatrix();
//
//        int maxArea = m1.MAH(v);
//
//        for(int i = 1;i<n;i++){
//            for(int j = 0;j<m;j++){
//                if(arr[i][j]==0){
//                    v[j] = 0;
//                }
//                else{
//                    v[j] = v[j] + arr[i][j];
//                }
//            }
//
//            maxArea = Math.max(maxArea, m1.MAH(v));
//        }
//
//        System.out.println("max area = " + maxArea);
//    }
//}
