package com.company;
/**
 * This program was created by Ahamed Careem (Github: amcareem, LinkedIn: https://www.linkedin.com/in/ahamedmusthafacareem/)
 *
 * All rights reserved. Copying or publishing this code anywhere else without permission is strictly prohibited.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Read the string from the user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            try {
                // Convert the string to a linked list of characters
                LinkedList<Character> charList = new LinkedList<>();
                for (char c : str.toCharArray()) {
                    charList.add(c);
                }

                // Reverse the linked list
                for (int i = 0, j = charList.size() - 1; i < j; i++, j--) {
                    char temp = charList.get(i);
                    charList.set(i, charList.get(j));
                    charList.set(j, temp);
                }

                // Convert the reversed linked list back to a string
                StringBuilder sb = new StringBuilder();
                for (char c : charList) {
                    sb.append(c);
                }
                str = sb.toString();
                // Printing the reversed string
                System.out.println("Reversed string: " + str);
            } catch (Exception e) {
                // Print an error message if an exception is thrown
                System.out.println("Error: Invalid string");
            }
        }
    }
}

//This program first reads a string from the user using a Scanner object. Then it converts the string to a linked list of characters using a LinkedList object and a loop. Next, it uses another loop to reverse the linked list. Finally, it converts the reversed linked list back to a string using a StringBuilder object and a loop, and prints the reversed string.