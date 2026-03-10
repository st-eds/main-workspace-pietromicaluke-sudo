public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 10, 3.8);
        Student s2 = new Student("Jordan", 11, 5.2);

        s1.showInfo();
        s2.showInfo();
    }
}

// 1. The shadowing problem covers up the instance variable and the
// "this" keyword makes sure that the variable being used is refering
// to the instance variable of the object, not a random other
// variable.

// 2. Constructor overloading allows you to create multiple
// objects with different types and amounts of information.
// (example: maybe some objects are missing information so you
// assign "unkown" to some of their variables)