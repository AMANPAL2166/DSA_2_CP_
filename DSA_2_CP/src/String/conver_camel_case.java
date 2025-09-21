package String;

public class conver_camel_case {
    public static void main(String[] args) {
        String s = "i got intern at geeksforgeeks";
        System.out.println(convertToCamelCase(s));

    }
    public static String convertToCamelCase(String s) {
         StringBuilder res = new StringBuilder();
         boolean captalizationNext = false;// Flag to indicate when to capitalize the next letter
        for(int i = 0; i<s.length(); i++)
        // If we encounter a space, set the flag to capitalize
        // the next character
        if(s.charAt(i) == ' '){
            captalizationNext = true;
            // If the flag is set, capitalize the current character
        }else if(captalizationNext == true){
            res.append(Character.toUpperCase(s.charAt(i)));
            //Reset the flag after captalization
            captalizationNext = false;

        }
        //otherwise, just add the currant character to the result
        else{
            res.append(s.charAt(i));
        }
        return res.toString();


    }

}
