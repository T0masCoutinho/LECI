package Aula_4.Ex2;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class CashRegister {

    private Product[] products;
    private int count;

    public CashRegister() {
        products = new Product[10];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getTotalValue();
        }
        return total;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += String.format("%-16s %8.2f %10d %10.2f \n", products[i].getName(), products[i].getPrice(),
                    products[i].getQuantity(), products[i].getTotalValue());
        }
        return s;
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));

        System.out.println("Product             Price   Quantity      Total");
        System.out.println(cr);

        System.out.println("Total value: " + cr.getTotalValue());

    }
}
