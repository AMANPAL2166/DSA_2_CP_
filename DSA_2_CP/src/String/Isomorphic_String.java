package String;

public class Isomorphic_String {
    public static boolean areIsomorphic(String s1, String s2){
        int n = s1.length();
        // marked[v] is a true if character
        // 'a'+v from s2 is already used
        boolean[] marked = new boolean[26];
        //map u stored in character index
        //in s2 that s1's  'a' +u maps to
        int[] map = new int[26];
        for(int i = 0; i<26; i++) map[i] = -1;
        for(int i = 0; i<n ; i++){
            int u = s1.charAt(i)-'a';
            int v = s2.charAt(i) - 'a';
            //if s1[i] has not been mapped yet
            if(map[u] == -1){
                //If s2[i] is already used
                //by another character
                if(marked[v]) return false;
                //Assign mapping and mark s2[i] as used
                map[u] = v;
                marked[v] = true;
            } else if (map[u] != v) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(areIsomorphic(s1, s2));
    }
}
