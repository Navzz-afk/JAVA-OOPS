import CIE.*;
import SEE.*;

import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        External[] students = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter USN: ");
            String usn = scanner.next();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            students[i] = new External(usn, name, sem);

            // Input internal marks
            System.out.println("Enter Internal Marks for 5 courses:");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            Internals internal = new Internals();
            internal.setMarks(internalMarks);

            // Input SEE marks
            System.out.println("Enter SEE Marks for 5 courses:");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = scanner.nextInt();
            }
            students[i].setMarks(externalMarks);

            // Calculate and display final marks
            System.out.println("\nFinal Marks for Student " + (i + 1) + ":");
            students[i].displayDetails();
            System.out.println("Course-wise Final Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMark = internalMarks[j] + (externalMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }
        scanner.close();
    }
}