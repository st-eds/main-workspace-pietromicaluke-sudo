public class Dog {
    String name;
    String breed;
    int age;
    static int dogCount = 0;

    void bark() {
        System.out.println("Woof!");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}