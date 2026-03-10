class BankAccount
{
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance)
    {
        this.owner = owner;

        if (balance < 0)
        {
            this.balance = 0;
        }
        else
        {
            this.balance = balance;
        }
    }

    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
    }
}