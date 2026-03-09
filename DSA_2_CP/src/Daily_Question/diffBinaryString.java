package Daily_Question;
//Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
//
//
//
//Example 1:
//
//Input: nums = ["01","10"]
//Output: "11"
//Explanation: "11" does not appear in nums. "00" would also be correct.
//Example 2:
//
//Input: nums = ["00","01"]
//Output: "11"
//Explanation: "11" does not appear in nums. "10" would also be correct.
//Example 3:
//
//Input: nums = ["111","011","001"]
//Output: "101"
//Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
/// The CP Secret: Cantor's Diagonal ArgumentYe problem ek classic mathematical concept par based hai jise Cantor's Diagonal Argument kehte hain.
///  Iska logic itna simple aur powerful hai ki aapko koi hashset ya complex checking ki zaroorat nahi padegi.Logic:
/// Humein ek aisi string banani hai jo array ki har string se kam se kam ek jagah par alag ho.Hum array ki pehli string ($nums[0]$) uthayenge aur uska pehla bit dekhenge. Hum apni result string ka pehla bit uska ulta (opposite) rakhenge.
/// Phir doosri string ($nums[1]$) ka doosra bit dekhenge aur apni string ka doosra bit uska ulta rakhenge.Aise hi $n$-th string tak chalte rahenge.Isse jo string banegi, wo guaranteed hai ki:Pehli string se alag hogi kyunki index $0$ par bit different hai.
/// Doosri string se alag hogi kyunki index $1$ par bit different hai.Aur aise hi har string se kisi na kisi index par alag hogi.
public class diffBinaryString {

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<nums.length;i++){
            // i-th string ka i-th character uthao aur use flip kardo
            char currenBit = nums[i].charAt(i);
            sb.append(currenBit == '0' ? '1':'0');
        }
        return sb.toString();

    }

    public static void main(String[] args) {

    }
}
