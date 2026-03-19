package String;

public class ReversString {
    public static String reverseString(String s) {
        // code here//using two pointer
        StringBuilder sb = new StringBuilder(s);
        int st = 0;
        int end = s.length()-1;
        while (st<=end){
            char temp = sb.charAt(st);
            sb.setCharAt(st, sb.charAt(end));
            sb.setCharAt(end, temp);
            st++;
            end--;
        }
        return sb.toString();

    }


    public static String reverseString_2(String s) {
        // code here//using inbuild method
        StringBuilder sb = new StringBuilder(s);
         sb.reverse();
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "AmanPal";
        System.out.println("Using two pointer: "+reverseString(s));
        System.out.println("Using inbuild method: " + reverseString_2(s));
    }
}
