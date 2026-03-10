public class Program
{
    public static void main(String[] args)
    {
        BankAccount acct = new BankAccount("Alex", 100);

        acct.deposit(50);
        acct.withdraw(30);

        System.out.println(acct.getOwner() + " - Balance: $" + acct.getBalance());
    }
}

// 1. An instance variable should almost always be private so that it 
// doesn't get changed when it isn't supposed to.

// 2. Setters prevent the problem of giving variables invalid values.

// 3. It is dangerous to modify private variables directly from
// outside the class because it is harder to control and there is no
// data validation.

// 4. The invariant of "amount > 0" is enforced by the setter
// "deposit" because it doesn't allow values of zero or less to be
// added to the bank account balance.

// 5. Accessors give the main program the value for the specific
// variable while the mutator changes the specific variable to the
// value it is given unless the value is invalid.