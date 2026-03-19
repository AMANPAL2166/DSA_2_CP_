package String;

public class InsertAtAnyPosition {
    public static String insert(StringBuilder s, int pos, char ch) {
        StringBuilder st = new StringBuilder();
        for(int  i = 0;i<s.length();i++){
            if(i==pos){
                st.append(ch);
            }
            st.append(s.charAt(i));
        }
//


        //edge case
        if(pos>=s.length() ){
            st.append(ch);
        }
        return st.toString();
//

    }

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Greek");
        String n = insert(st,2,'D');
        System.out.println(n);
    }

}
