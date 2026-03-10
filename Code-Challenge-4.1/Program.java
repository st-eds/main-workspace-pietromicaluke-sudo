public class Program
{
    public static void main(String[] args)
    {
        System.out.println("-- Invoice Demo --\n");
        Invoice i = new Invoice(1001, 199.99);
        System.out.println(i.getSummary());
        i.setCustomer("Ada Lovelace", "adalovelace@gmail.com");
        System.out.println("\nAssigning customer...\n" + i.getSummary());
        i.markPaid();
        System.out.println("\nMarking invoice paid...\n" + i.getSummary());
    }
}