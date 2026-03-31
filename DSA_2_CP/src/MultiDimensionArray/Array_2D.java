package MultiDimensionArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(33);a.add(34);a.add(35);
        ArrayList<Integer> b= new ArrayList<>();
        b.add(36);b.add(37);b.add(38);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(39);c.add(40);c.add(41);
        arr.add(a);arr.add(b);arr.add(c);
        ///  add empty array
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);//add 10 to last new array list
        arr.get(arr.size()-1).add(20);//add 20
//        for(int i = 0;i<arr.size();i++){
//            System.out.print("[");
//            for(int j = 0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j) +" ");
//            }
//            System.out.print("]");
//        }
        ///  for each loop
        for(ArrayList<Integer> list : arr ){
            for(int ele : list){
                System.out.print(ele +" ");
            }
            System.out.println();
        }

    }
}
