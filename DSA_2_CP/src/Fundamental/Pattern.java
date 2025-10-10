package Fundamental;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("This is for Z Printing: ");
        System.out.println("This is for Z Printing: ");
        int size = 5; // Adjust size as needed

// Top horizontal line
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

// Diagonal line
        for (int i = 1; i < size - 1; i++) { // Iterate between the first and last row
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" "); // Print spaces
            }
            System.out.print("*"); // Print the star on the diagonal
            System.out.println();
        }

// Bottom horizontal line
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();


    }



}
