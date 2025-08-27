package Fundamental;

import java.util.ArrayList;
import java.util.List;

public class Large_number {
//    static boolean div13(String s){
//        int len = s.length();
//        //Special case
//        if(len == 1 && s.charAt(0)=='0'){ return true;}
//        //Make the lenght multiple of 3
//        if(len % 3 == 1){
//            s+= "00";
//            len+=2;
//        }else if(len % 3 == 2){
//            s += "0";
//            len += 1;
//        }
//        int sum = 0 ;
//        int p = 1;
//        //Traverse form right to left in step 3 digits
//        splitIntoThreeDigitBlocks(s);
//
//
//    }
//
//    public static List<String> splitIntoThreeDigitBlocks(String s) {
//        // A list to store the 3-digit blocks.
//        List<String> blocks = new ArrayList<>();
//
//        // Start the index at the end of the string.
//        int endIndex = s.length();
//
//        // Loop backward as long as there are characters left.
//        while (endIndex > 0) {
//            // Determine the starting index for the current block.
//            int startIndex = endIndex - 3;
//
//            // If the start index goes below 0, it means the last block
//            // has fewer than 3 digits.
//            if (startIndex < 0) {
//                startIndex = 0;
//            }
//
//            // Extract the block using substring and add it to the list.
//            // substring(startIndex, endIndex) takes characters from startIndex
//            // up to (but not including) endIndex.
//            blocks.add(s.substring(startIndex, endIndex));
//
//            // Move the endIndex to the beginning of the last-extracted block.
//            endIndex = startIndex;
//        }
//
//        return blocks;
//    }
}
