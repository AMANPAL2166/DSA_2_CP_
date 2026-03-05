package Daily_Question;

public class MinChange {
    public static int minOperations(String s) {
        int count = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            i++;
        }
        return count;

    }

    public static void main(String[] args) {
        String s = "10010100";
        System.out.println(minOperations(s));
    }
}
