public class Program {
    public static void main(String[] args) {
        
        String name = "Mr. Mortimer";
        int age = 30;
        double balance = 150.00;
        boolean isTeacher = true;
        boolean isMillionaire = false;

        System.out.println("-Name Checks-");

        boolean nameIsMortimer = name.equals("Mr. Mortimer");

        System.out.println("Is my name Mr. Mortimer? " + nameIsMortimer);
        System.out.println("Is my name Mr. Mertens? " + name.equals("Mr. Mertens"));
        System.out.println("My name is not Mr. Merriman: " + !name.equals("Mr. Merriman"));


        System.out.println("\n-Age-Related Checks-");

        boolean canDrive = age >= 16;
        boolean canRentCar = age >= 25;
        boolean isSenior = age >= 65;

        System.out.println("Am I old enough to drive? " + canDrive);
        
        System.out.println("Am I old enough to rent a car? " + canRentCar);
        System.out.println("Am I eligible for a senior citizen discount? " + isSenior);

        System.out.println("\n-Bank Account Checks-");

        boolean canBuyCar = balance > 31000;
        boolean hasFunds = balance > 0;

        System.out.println("Do I have enough to buy a Dodge Challenger? " + canBuyCar);
        System.out.println("Do I have a positive bank balance? " + hasFunds);

        System.out.println("\n-Boolean Checks-");

        System.out.println(name + " is a teacher: " + isTeacher);
        System.out.println(name + " is a millionaire: " + isMillionaire);

        boolean notMillionaire = !isMillionaire;
        System.out.println("So, " + name + " isn't a millionaire? " + notMillionaire);

        System.out.println("\n-Logical Operator Examples-");
        boolean canDriveAndBuy = canDrive && canBuyCar;
        System.out.println("Am I old enough to drive AND have enough to buy a Dodge Challenger? " + canDriveAndBuy);
        boolean canDriveOrBuy = canDrive || canBuyCar;
        System.out.println("am I old enough to drive OR have enough to buy a Dodge Challenger? " + canDriveOrBuy);
        // 1. Boolean expressions connect to real-world
        // decision-making processes because of how it evaluates
        // if different expressions are true or false by 
        // comparing different data values to one another. 

        // 2. You would need to use a combination of relational
        // operators and a logical operators to determine if a
        // person is trying to log into an application and the
        // need the correct username and password.
    }
}