public class Program
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Alex";
        s1.gradeLevel = 10;
        s1.gpa = 3.8;

        Student s2 = new Student();
        s2.name = "Jordan";
        s2.gradeLevel = 11;
        s2.gpa = 3.2;

        s1.introduce();
        s1.showGpa();
        s1.checkHonorRoll();

        System.out.println();

        s2.introduce();
        s2.showGpa();
        s2.checkHonorRoll();
    }
}

// 1. A class lists the type of characteristics that define any
// object within the class. For instance, the student class listed
// all of the types of qualities that make up a student, while the
// student objects defined specific qualities that make each student
// object unique.

// 2. The dot operator is used to complete a specific method (task)
// for a specific object. For example, "s1.showGpa();" carried out
// the method "showGpa()," but only specifically for the object "s1."

// 3. If we tried to store all of the student information in separate
// variables, we would have so many extra variables that would make
// it hard to navigate/organize the code.

// 4. Organizing code into classes and objects makes organizing and
// managing code much easier as there aren't so many extra variables
// to deal with.