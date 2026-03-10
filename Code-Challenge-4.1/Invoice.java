public class Invoice {
    private int invoiceNumber;
    private double amount;
    private boolean paid;
    private Customer customer;

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        customer = null;
        paid = false;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String isPaid() {
        if (paid) {
            return "PAID";
        }
        else {
            return "UNPAID";
        }
    }

    public void setCustomer(String name, String email) {
        customer = new Customer(name, email);
    }

    public void clearCustomer() {
        customer = null;
    }

    public String getCustomerName() {
        if (customer == null) {
            return "none";
        }
        else {
            return customer.getName();
        }
    }

    public void markPaid() {
        paid = true;
    }

    public String getSummary() {
            return "Invoice #" + invoiceNumber + " | Customer: " + getCustomerName() + " | Amount: $" + amount + " | Status: " + isPaid();
    }
}