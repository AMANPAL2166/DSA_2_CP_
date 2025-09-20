package String;

public class Basic {
    public static void main(String[] args) {
        String s1 = "aman";
        String s2 = "aman";
        if(areStringsame2(s1, s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // For search character
        String s = "geeksforgeeks";
        char ch = 'k';
        System.out.println( "Search character in given String:-> " +searchchar2(s,ch));
        // For insert char at any index

         StringBuilder sh = new StringBuilder("Geeksforgeeks");
        System.out.println("Insert char:-> " + inseartchar2(s1,'c',3));
        System.out.println("Remove character: -> " + removechar("Amaan", 'a'));
        removeCharacter2(sh, 'k');
        String h = s.substring(0, 4);
        System.out.println("Substring of:->:" +h);


    }
    public static boolean areStringsame(String s1, String s2){
        return s1.equals(s2);
    }
    public static boolean areStringsame2(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        //Compare each character
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;

            }
        }
        return true;
    }
    public static int searchchar(String s1, char c){
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
    public static int searchchar2(String s1, char c){
        int idx = s1.indexOf(c);
        return ( idx != -1)? idx : -1;
    }
    //Insert character of at any position
    public static String inseartchar(StringBuilder s, char c, int posi){
        s.insert(posi,c);
        return s.toString();
    }
    public static String inseartchar2(String s, char c, int posi){
        StringBuilder sc = new StringBuilder();
        for(int i= 0; i<s.length(); i++){
            if(i == posi){
                sc.append(c);
            }
            //Insert the original character
            sc.append(s.charAt(i));
        }
        if(posi >= s.length()){
             sc.append(c);
        }
        return sc.toString();
    }
    // remove occurance of character
    public static String removechar(String word, char c){
        StringBuilder res = new StringBuilder(word);
        for(int i = 0; i<res.length();i++){
            if(res.charAt(i) == c){
                res.deleteCharAt(i);
                i--;
            }
        }
        return res.toString();
    }
    public  static void removeCharacter2(StringBuilder s, char c) {
        // code here
        StringBuilder res = new StringBuilder(s);
        for(int i = 0; i<res.length();i++){
            if(res.charAt(i) == c){
                res.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(res );


    }

}
