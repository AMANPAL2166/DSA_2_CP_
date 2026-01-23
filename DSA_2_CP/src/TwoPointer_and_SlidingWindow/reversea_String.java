package TwoPointer_and_SlidingWindow;

public class reversea_String {
    //Naive approach
    static void reverseString(String str){
        char[] inputArray  = str.toCharArray();
        char[] result = new char[inputArray.length];
        for(int i= 0;i<inputArray.length ; i++){
            if(inputArray[i] ==' '){
                result[i] = ' ';

            }
        }
        //Traverse input string from beginning
        //and put character in result from end
        int j = result.length-1;
        for(int i = 0; i<inputArray.length ;i++){
            //ignore space in input string
            if(inputArray[i] != ' '){
                //ignore space in result
                if(result[j] == ' '){
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));

    }
    //Expected -two pointer approach
    public static String preserveSpace(String str)
    {
        int n = str.length();

        // Initialize two pointers as two corners
        int start = 0;
        int end = n - 1;

        char[] Str = str.toCharArray();

        // Move both pointers toward each other
        while (start < end)
        {

            // If character at start or end
            // is space, ignore it
            if (Str[start] == ' ')
            {
                start++;
                continue;
            }
            else if (Str[end] == ' ')
            {
                end--;
                continue;
            }

            // If both are not spaces, do swap
            else
            {
                char temp = Str[start];
                Str[start] = Str[end];
                Str[end] = temp;
                start++;
                end--;
            }

        }
        return String.valueOf(Str);
    }

    public static void main(String[] args) {
        String st = "internship at geeks for geeks";
        reverseString(st);
        System.out.println(preserveSpace(st));
    }

}
