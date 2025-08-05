package String;
//https://www.geeksforgeeks.org/dsa/reverse-a-string/
public class Reverse_String {
    public static void main(String[] args) {
        String s = "Aman Pal";
        System.out.println(reverestr(s));
    }

    private static String reverestr(String s) {
        // First create a String builder
        StringBuilder res = new StringBuilder();
        // Traverse S on backward direction
        // and add each  character to a new string
        for(int i = s.length()-1; i>= 0; i--){
            res.append(s.charAt(i));//In Java, the append() method is used primarily with StringBuilder and StringBuffer
            // objects to efficiently add data to the end of an existing character sequence.

        }
        return res.toString();
    }
}
