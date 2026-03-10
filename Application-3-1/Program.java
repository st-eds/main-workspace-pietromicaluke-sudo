

public class Program {
    public static void main(String[] args) {
        System.out.println("Inches to Centimeters: " + inchesToCm(5.0));
        System.out.println("Max of (8, 3): " + max(8, 3));
        System.out.println("Area of Circle (r=3): " + circleArea(3));
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("98.6°F in Celsius: " + toCelsius(98.6));
        System.out.println("Average of (5, 7, 9): " + averageOfThree(5, 7, 9));
    }
    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
    public static int max(int x, int y){
        if (x > y) {
            return x;
        }
        else {
            return y;
        }
    }
    public static double circleArea(double r) {
        return ((r * r) * Math.PI);
    }
    public static String isEven(int x) {
        return x % 2 == 0 ? "true" : "false";
    }
    public static double toCelsius(double F) {
        return (F - 32) * 5 / 9;
    }
    public static double averageOfThree(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}