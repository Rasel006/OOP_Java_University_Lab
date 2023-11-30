public class Product {

    private String productName;
    private double price;
    private int quantity;

    public Product() {
        this.productName = "No Product";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setProductInfo(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }

    private void internalMethod() {
    }

    protected void protectedMethod() {
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.displayProductInfo();

        Product product2 = new Product("Laptop", 899.99, 2);
        product2.displayProductInfo();

        product1.setProductInfo("Smartphone", 499.99, 3);
        product1.displayProductInfo();
    }
}


