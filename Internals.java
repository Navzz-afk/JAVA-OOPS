package CIE;

public class Internals {
    public int[] internalMarks = new int[5]; 

    public void setMarks(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, internalMarks, 0, 5);
        } else {
            System.out.println("Please provide marks for exactly 5 courses.");
        }
    }

    public int[] getMarks() {
        return internalMarks;
    }
}