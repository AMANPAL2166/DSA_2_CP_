package Pattern.BinarySearch;

public class nextGreatestLetter {
    public static char nextGreater(char[] letters, char target  ){
        int st = 0, end = letters.length;
        char ans = letters[0];
        while(st<=end){
            int mid = st+(end-st)/2;
            if(letters[mid] > target){
                ans = letters[mid];
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] letters = { 'c', 'f','j'};
        System.out.println(nextGreater(letters, 'd'));
    }
}
