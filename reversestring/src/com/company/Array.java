package com.company;
/**
 * This program was created by Ahamed Careem (Github: amcareem, LinkedIn: https://www.linkedin.com/in/ahamedmusthafacareem/)
 *
 * All rights reserved. Copying or publishing this code anywhere else without permission is strictly prohibited.
 */
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Read the string from the user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            try {
                // Converting the string into an array of characters
                char[] charArray = str.toCharArray();

                // Reverse the array
                for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }

                // Converting the reversed array back to a string
                str = new String(charArray);
                // Print the reversed string
                System.out.println("Reversed string: " + str);
            } catch (Exception e) {
                // Print an error message if an exception is thrown
                System.out.println("Error: Invalid string");
            }
        }
    }
}

//    This program first reads a string from the user using a Scanner object. Then it converts the string to an array of characters using the toCharArray() method. Next, it uses a loop to reverse the array. Finally, it converts the reversed array back to a string using the String constructor, and prints the reversed string.