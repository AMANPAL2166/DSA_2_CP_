package String;

public class ReverseWord {
    public static String reverseWords(String s) {
        //given a string array
        //trim s
        s = s.trim();
        String[] words = s.split("\\s+");
        System.out.println("String after split words: "+ words.toString());
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
