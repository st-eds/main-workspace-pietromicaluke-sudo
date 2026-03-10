class Student {
    String name;
    int gradeLevel;
    double gpa;

    Student()
    {
        name = "Unnamed";
        gradeLevel = 9;
        gpa = 0.0;
    }

    Student(String name, int gradeLevel, double gpa)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;

        if (gpa < 0.0 || gpa > 4.0)
        {
            System.out.println("Invalid GPA! Setting to 0.0...");
            this.gpa = 0.0;
        }
        else
        {
            this.gpa = gpa;
        }
    }

    void showInfo()
    {
        System.out.println(name + " (Grade " + gradeLevel + ") — GPA: " + gpa);
    }
}