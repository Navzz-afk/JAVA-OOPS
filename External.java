package SEE;

import CIE.Student;

public class External extends Student {
    public int[] externalMarks = new int[5]; // Marks for 5 courses

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setMarks(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, externalMarks, 0, 5);
        } else {
            System.out.println("Please provide marks for exactly 5 courses.");
        }
    }

    public int[] getMarks() {
        return externalMarks;
    }
}