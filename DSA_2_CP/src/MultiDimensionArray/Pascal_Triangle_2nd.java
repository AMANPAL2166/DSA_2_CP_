package MultiDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_2nd {
    public static List<Integer> getRow(int rowIndex) {
       List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<rowIndex+1;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<i;j++){
                list.add(1);
            }
            ans.add(list);

        }
        for(int i = 0;i<rowIndex+1;i++){
            for(int j = 0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).set(j,1);
                }else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }


        }
        return ans.get(rowIndex);


    }

    public static void main(String[] args) {
        List<Integer> arr = getRow(3);
        for(int i=0;i<arr.size();i++ ){
            System.out.println(arr.get(i) + " ");
        }
    }
}
