public class Program {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Sparky";
        myDog.breed = "Boxer";
        myDog.age = 1;

        System.out.println("Meet " + myDog.name + " the " + myDog.breed + ".");
        myDog.eat();
        myDog.bark();
        System.out.println(Dog.dogCount);
    }
} 