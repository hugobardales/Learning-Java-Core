/*
 *Write a Java program that takes a string as input. The program should return a new 
  string where every character in the original string is duplicated. Your program should read 
  a line from the standard input and print the output to the standard output.
 */

import java.util.Scanner;

public class DuplicateChar {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        scanner.close();
        
        StringBuilder dupliChar = new StringBuilder();
        
        for (char c: stringInput.toCharArray()) {
            dupliChar.append(c).append(c);
        }

        System.out.println(dupliChar.toString());
    }
}
