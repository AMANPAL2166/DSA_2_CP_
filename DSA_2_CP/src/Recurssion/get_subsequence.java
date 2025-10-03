package Recurssion;
import java.util.*;

public class get_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr = "abc";
        ArrayList<String> res = gss(sr);
        System.out.println(res);


    }

    public static ArrayList<String>  gss(String sr){
        //base case
        if(sr.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;

        }
        char ch = sr.charAt(0);
        String ros = sr.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add("" + rstr);

        }
        for(String rstr : rres){

            mres.add(ch+ rstr);
        }
        return  mres;


    }
}
