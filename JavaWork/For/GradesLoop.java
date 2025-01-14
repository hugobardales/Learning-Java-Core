/**
Find the number of D, C, B and A grades for the last test on informatics, where n students from 
a class have successfully passed the test.
The program gets number n as the first line of input. This means there will be n number of grades. 
Then the program gets the grades themselves, each on a new line.
Create a program to count the the occurrence of each grade and output four numbers in a single 
line: the number of D, C, B, and A grades (in that order), separated by blank space characters.
*/

import java.util.Scanner;

public class GradesLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGrades = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < numGrades; i++) {
            String grade = scanner.next(); 
            grade = grade.toUpperCase();

            if (grade.equals("D")) {
                countD++;
            } else if (grade.equals("C")) {
                countC++;
            } else if (grade.equals("B")) {
                countB++;
            } else if (grade.equals("A")) {
                countA++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
        scanner.close(); 
    }
}
