package String;

public class longest_Common_pre {
    public static void main(String[] args) {
        String[] s = { "flower","flow","flight"};
        System.out.println(longestcommonPrefix(s));

    }
    public static String longestcommonPrefix(String[] strs){
        //Base case
        if(strs == null || strs.length ==0){
            return " ";
        }
        String prefix = strs[0];
        for (int i = 0; i<strs.length; i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return " ";
                }
            }

        }
        return prefix;
    }
}
