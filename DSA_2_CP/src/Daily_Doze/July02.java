package Daily_Doze;

import java.util.ArrayList;

public class July02 {
    public static int compareVersion(String version1, String version2) {
        ArrayList<Float> version01 = new ArrayList<Float>();
        ArrayList<Float> version02 = new ArrayList<Float>();
        for(int i = 0;i<version1.length();i++){
            float ch = version1.charAt(i);
            version01.add(ch);
        }
        for(int i = 0;i<version2.length();i++){
            float ch = version2.charAt(i);
            version02.add(ch);
        }

        for (int i = 0; i < version01.size(); i++) {
            if (version02.get(i) > version01.get(i)) {
                return 1;
            } else if (version02.get(i) < version01.get(i)) {
               return -1;
            }
        }
        return 0;
        //This is totally wrong approach because maine rivioin compare karna hai na ki stiring


    }
    public static int compareVersion_(String version1, String version2) {
        //splite arr1 on the basis of "."
        String[] arr1 = version1.split("\\.");
        //same here
        String[] arr2 = version2.split("\\.");
        for(int i= 0;i<Math.max(arr1.length, arr2.length);i++){//run till the max length of arr
            int rev1 = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;//Agar i length se kam hai toh Integer.parse use karo jo ki extra leading zero ko hata deta hai aur aur length se chota hai toh 0
            // use karo solve hadle edge cases
            int rev2 = (i < arr2.length) ? Integer.parseInt(arr2[i]) : 0;//same here
            if(rev1>rev2){//condition to check
                return 1;
            }else if(rev1 < rev2) {
                return -1;
            }

        }
        return 0;//otherwise return 0
        //time: O(n+m)
        //space: O(n+m)

    }


    public static void main(String[] args) {
        String  version1 = "1.0", version2 = "1.0.0.0";
        System.out.println(compareVersion_(version1,version2));
    }
}
