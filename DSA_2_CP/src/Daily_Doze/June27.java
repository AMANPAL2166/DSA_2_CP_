package Daily_Doze;

public class June27 {
    public static int romanToInt__(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;
        for(int i = 0;i<ch.length-1;i++){
            if(ch[i] == 'I' && ch[i+1] == 'V'){
                ans += 4;
                i++;
                break;//wrong place: it'll break the entire loop

            } else if (ch[i] == 'I' && ch[i+1] == 'X') {
                ans += 9;
                i++;
                break;
            }
            if(ch[i] == 'I'){
                ans+= 1;
                break;
            }
            if(ch[i] == 'X' && ch[i+1] == 'L'){
                ans += 40;
                i++;
                break;
            } else if (ch[i] == 'X' && ch[i+1] == 'C') {
                ans += 90;
                i++;
                break;
            }
            if(ch[i] == 'X'){
                ans += 10;
                break;
            }
            if(ch[i] == 'C' && ch[i+1] == 'D'){
                ans += 400;
                i++;
                break;
            } else if (ch[i] == 'C' && ch[i+1] == 'M') {
                ans += 900;
                i++;
                break;
            }
            if(ch[i] == 'C'){
                ans += 100;
                break;
            }
            if(ch[i] == 'V'){
                ans += 5;
                break;
            }
            if(ch[i] == 'L'){
                ans += 50;
                break;
            }
            if(ch[i] == 'D'){
                ans += 500;
                break;
            }
            if(ch[i] == 'M'){
                ans += 1000;
                break;
            }

        }
        return ans;

    }
    //Approach that will give right output
    public static int romanToInt(String str){
        int ans = 0, lastVal = 0;
        char[] ch = str.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            int currVal = 0;
            if(ch[i] == 'I'){
                currVal = 1;
            }else if (ch[i] == 'V'){
                currVal = 5;
            }
            else if (ch[i] == 'X'){
                currVal = 10;
            }
            else if (ch[i] == 'L'){
                currVal = 50;
            }
            else if (ch[i] == 'C'){
                currVal = 100;
            }else if (ch[i] == 'D'){
                currVal = 500;
            }else if (ch[i] == 'M'){
                currVal = 1000;
            }
            if(currVal < lastVal){
                ans -= currVal;
            }else{
                ans += currVal;
            }
            lastVal = currVal;
        }
        return ans;
    }

    public static void main(String[] args) {
        String st = "MCMXCIV";
        System.out.println(romanToInt(st));
    }
}
