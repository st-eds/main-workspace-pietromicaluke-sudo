class Student {
    private String name;
    private static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}