// Define the custom exception for invalid age
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Base class Father
class Father {
    protected int fatherAge;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.fatherAge = age;
    }
}

// Derived class Son
class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Call Father class constructor
        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative.");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
    }

    public void displayAges() {
        System.out.println("Father's Age: " + fatherAge);
        System.out.println("Son's Age: " + sonAge);
    }
}

// Main class
public class ExceptionHandlingInheritance {
    public static void main(String[] args) {
        try {
            System.out.println("Creating Father with age 40 and Son with age 20:");
            Son son1 = new Son(40, 20);
            son1.displayAges();

            System.out.println("\nCreating Father with age -5:");
            Son son2 = new Son(-5, 10); // This will throw an exception
        } catch (WrongAge e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nCreating Father with age 30 and Son with age 35:");
            Son son3 = new Son(30, 35); // This will throw an exception
        } catch (WrongAge e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}