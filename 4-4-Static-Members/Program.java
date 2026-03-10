public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Alex");
        Student s2 = new Student("Jordan");
        Student s3 = new Student("Riley");

        System.out.println("Total students: " + Student.getStudentCount());

        System.out.println("20C in F: " + TemperatureConverter.cToF(20));
        System.out.println("72F in C: " + TemperatureConverter.fToC(72));
    }
}

// 1. An instance variable pertains to one object within a class,
// while a static variable pertains to the class as a whole.

// 2. Static methods can't access instance variables directly
// because instance variables pertain to specific objects, not the
// class as a whole.

// 3. A static variable could be used to keep track of a bank's
// routing number.

// 4. Main is static because it starts running before any objects
// are created.

// 5. Using static methods is preferable to instance methods when
// you want to return the value of a static variable to the main
// program.