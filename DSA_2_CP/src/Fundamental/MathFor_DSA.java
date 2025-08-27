package Fundamental;

import java.util.ArrayList;
import java.util.List;

public class MathFor_DSA{
public static List<String> splitIntoThreeDigitBlocks(String s) {
    // A list to store the 3-digit blocks.
    List<String> blocks = new ArrayList<>();

    // Start the index at the end of the string.
    int endIndex = s.length();

    // Loop backward as long as there are characters left.
    while (endIndex > 0) {
        // Determine the starting index for the current block.
        int startIndex = endIndex - 3;

        // If the start index goes below 0, it means the last block
        // has fewer than 3 digits.
        if (startIndex < 0) {
            startIndex = 0;
        }

        // Extract the block using substring and add it to the list.
        // substring(startIndex, endIndex) takes characters from startIndex
        // up to (but not including) endIndex.
        blocks.add(s.substring(startIndex, endIndex));

        // Move the endIndex to the beginning of the last-extracted block.
        endIndex = startIndex;
    }

    return blocks;
}

public static void main(String[] args) {
    String num = "291128500";
    List<String> blocks = splitIntoThreeDigitBlocks(num);
    System.out.println("Original string: " + num);
    System.out.println("Blocks: " + blocks);

    // Another example with a different length
    String anotherNum = "1234567";
    List<String> anotherBlocks = splitIntoThreeDigitBlocks(anotherNum);
    System.out.println("Original string: " + anotherNum);
    System.out.println("Blocks: " + anotherBlocks);
    }
}
