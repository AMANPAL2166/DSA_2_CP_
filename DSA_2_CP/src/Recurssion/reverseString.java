package Recurssion;

public class reverseString {
    public static String reverse(String str){
        //base case
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "aman";
        System.out.println(reverse(str));
    }
}
