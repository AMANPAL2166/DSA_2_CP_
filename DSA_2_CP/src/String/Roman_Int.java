package String;
//https://www.geeksforgeeks.org/dsa/roman-number-to-integer/
public class Roman_Int {
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romantodecimal(s));

    }
    static int value(char r){
        if( r == 'I')
            return 1;
        if( r == 'V')
            return 5;
        if( r == 'X')
            return 10;
        if( r == 'L')
            return 50;
        if(r == 'C')
            return 100;
        if(r == 'D')
            return 500;
        if(r == 'M')
            return 1000;
        return -1;
    }
    static int romantodecimal( String s){
        int res = 0;
        for(int i = 0; i< s.length(); i++){
            // get value of current symbol
            int s1 = value(s.charAt(i));
            // Compare with the next symbol if exist
            if( i + 1 < s.length()){
                int s2 = value(s.charAt(i+1));
                //If current value greater or equal
                //add it to result
                if(s1 >= s2){
                    res += s1;
                }else{
                    //else, add the difference and skip
                    //next symbol
                    res += (s2-s1);
                    i++;
                }
            }
            else{
                res += s1;
            }
        }
        return res;
    }
}
