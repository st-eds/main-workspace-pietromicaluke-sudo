public class Program {
    public static void main(String[] args) {
        System.out.println(add(4, 5));
        System.out.println(add(4.5, 2.3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(3, 2.5));
        System.out.println(add(2.5, 3));

        System.out.println("Circle area: " + area(3.0));
        System.out.println("Rectangle area: " + area(4.0, 6.0));
        System.out.println("Triangle area: " + area(5.0, 3.0, true));
    }

    static int add(int a, int b)
    {
        return a + b;
    }

    static double add(double a, double b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    static double add(int a, double b)
    {
        System.out.println("int + double version called");
        return a + b;
    }
    static double add(double a, int b)
    {
        System.out.println("double + int version called");
        return a + b;
    }
    static double area(double radius)
    {
        return Math.PI * radius * radius;
    }
    static double area(double width, double height)
    {
        return width * height;
    }
    static double area(double base, double height, boolean triangle)
    {
        return 0.5 * base * height;
    }
}

// 1. The number and parameter types of the variable(s) determines
// which overload method executes.

// 2. You can't overload a method by changing only the return type
// because only the parameter list can overload a method.

// 3. Overloading allows you to use similar functions with different
// numbers and types of variables. Instead of using a new,
// complicated name for the same purpose but different parameters,
// you can just keep the same name to keep the code easier to read
// and manage.

// 4. I have seen method overloading used with
// "System.out.println();" because it is able to use 10 different
// parameters.