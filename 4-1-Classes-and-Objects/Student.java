public class Student
{
    String name;
    int gradeLevel;
    double gpa;

    void introduce()
    {
        System.out.println("Hi, I'm " + name + " and I'm in grade " + gradeLevel + ".");
    }

    void showGpa()
    {
        System.out.println(name + "'s GPA is " + gpa + ".");
    }

    void checkHonorRoll()
    {
        if (gpa >= 3.5)
        {
            System.out.println(name + " made the honor roll!");
        }
        else
        {
            System.out.println(name + " did not make the honor roll this time.");
        }
    }
}