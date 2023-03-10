package com.company;
/**
 * This program was created by Ahamed Careem (Github: amcareem, LinkedIn: https://www.linkedin.com/in/ahamedmusthafacareem/)
 *
 * All rights reserved. Copying or publishing this code anywhere else without permission is strictly prohibited.
 */
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Read the string from the user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            try {
                // Converting the string to a stack of characters
                Stack<Character> charStack = new Stack<>();
                for (char c : str.toCharArray()) {
                    charStack.push(c);
                }

                // Reverse the stack
                StringBuilder sb = new StringBuilder();
                while (!charStack.isEmpty()) {
                    sb.append(charStack.pop());
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

//his program first reads a string from the user using a Scanner object. Then it converts the string to a stack of characters using a Stack object and a loop. Next, it uses a while loop to pop all the characters off the stack and append them to a StringBuilder object, which is used to build the reversed string. Finally, it prints the reversed string.