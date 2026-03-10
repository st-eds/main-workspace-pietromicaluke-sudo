public class Program {
    public static void main(String[] args) {
        Product p1 = new Product("T-Shirt", 19.99, 10);
        Product p2 = new Product();
        p2.setDetails("Mug", 7.50, 0);
        System.out.println("Created products:");
        p1.getDetails();
        p2.getDetails();
        System.out.println("\nRestocking Mug by 5...");
        p2.restock(5);
        p2.getDetails();
        System.out.println("\nSelling 3 T-Shirts...");
        p1.sell(3);
        p1.getDetails();
        System.out.println("\nApplying 20% discount to T-Shirts...");
        p1.applyDiscount(20);
        p1.getDetails();
        System.out.println("\nAttempting to sell 10 Mugs...");
        if (!p2.sell(10)) {
            System.out.println("Not enough stock to complete sale.");
        }
        p2.getDetails();
        System.out.println("\nTotal products created: " + Product.getProductCount());
    }
}