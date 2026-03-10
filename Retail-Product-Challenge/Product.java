class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    static private int numberOfProducts = 0;

    public Product() {
        numberOfProducts ++;
        this.id = 1000 + numberOfProducts;
        this.name = "Unnamed Product";
        this.price = 0;
        this.stock = 0;
    }
    public Product(String name, double price, int stock) {
        numberOfProducts ++;
        this.id = 1000 + numberOfProducts;
        this.name = name;
        if (price < 0) {
            this.price = 0;
        }
        else {
            this.price = price;
        }
        if (stock < 0) {
            this.stock = 0;
        }
        else{
            this.stock = stock;
        }
    }
    public void setDetails(String name, double price, int stock) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        }
        else {
            this.price = price;
        }
        if (stock < 0) {
            this.stock = 0;
        }
        else{
            this.stock = stock;
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void restock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        }
    }
    public boolean sell(int amount) {
        if (amount > 0 && amount <= stock) {
            this.stock -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100){
            percent = (100 - percent) / 100;
            this.price *= percent;
        }
    }
    public static int getProductCount() {
        return numberOfProducts;
    }
    public void getDetails() {
        System.out.println("[" + id + "] " + name + " - $" + price + " (Stock: " + stock + ")");
    }
}