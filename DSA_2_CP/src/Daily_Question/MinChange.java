package Daily_Question;

public class MinChange {
    public static int minOperations(String s) {
        int count = 0;
        int n= s.length();
        for(int i = 1;i<n;i++){

            if(n%2 == 0){
                if(s.charAt(i) !='0')count++;
            }else{
                if(s.charAt(i) != '1')count++;
            }

        }
        return Math.min(count,n-count);

    }

    public static void main(String[] args) {
        String s = "10010100";
        System.out.println(minOperations(s));
    }
}
