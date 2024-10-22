import java.util.Scanner;

// Class to store details like name, USN, marks, and credits
class Details {
    String name;
    String usn;
    int[] marks = new int[5];    // Array to store marks of 5 subjects
    int[] credits = new int[5];  // Array to store credits of 5 subjects

    // Method to get student details, marks, and credits
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        // Getting marks
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        // Getting credits
        System.out.println("Enter credits for the same 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " credits: ");
            credits[i] = sc.nextInt();
        }
    }
}

// Class to display student details, marks, and credits
class Display {
    public void displayDetails(Details details) {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + details.name);
        System.out.println("USN: " + details.usn);
        System.out.println("Marks and Credits:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": Marks = " + details.marks[i] + ", Credits = " + details.credits[i]);
        }
    }
}

// Class to calculate SGPA
class SGPA {
    // Method to calculate SGPA using marks and credits
    public double calculateSGPA(int[] marks, int[] credits) {
        int totalCredits = 0;
        int weightedMarksSum = 0;

        // Calculating weighted sum of marks and total credits
        for (int i = 0; i < 5; i++) {
            weightedMarksSum += marks[i] * credits[i];
            totalCredits += credits[i];
        }

        // SGPA formula: Weighted average of marks / Total credits
        return (double) weightedMarksSum / totalCredits;
    }
}

// Main class to create objects and handle multiple students
public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to hold 3 students
        Details[] students = new Details[3];

        // Creating instances for each student and getting their details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Details();
            students[i].getDetails();
        }

        Display studentDisplay = new Display();
        SGPA sgpaCalculator = new SGPA();

        // Displaying details and calculating SGPA for each student
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDisplaying details for student " + (i + 1) + ":");
            studentDisplay.displayDetails(students[i]);

            // Calculating and displaying SGPA for the student
            double sgpa = sgpaCalculator.calculateSGPA(students[i].marks, students[i].credits);
            System.out.printf("\nSGPA for student " + (i + 1) + ": %.2f\n", sgpa);
        }
    }
}
