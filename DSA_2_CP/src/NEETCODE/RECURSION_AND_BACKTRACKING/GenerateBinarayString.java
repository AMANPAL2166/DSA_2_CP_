package NEETCODE.RECURSION_AND_BACKTRACKING;

public class GenerateBinarayString {
    public static void generate(String output, int n) {
        //base case
        if(n== 0){
            System.out.println(output);
            return;
        }
        //first recursive call
        generate(output+"0", n-1);
        //second recursive call
        if(output.isEmpty() || output.charAt(output.length()-1) != '1'){
            generate(output+"1", n-1);
        }

    }

    public static void main(String[] args) {
        generate("", 3);
    }

}
