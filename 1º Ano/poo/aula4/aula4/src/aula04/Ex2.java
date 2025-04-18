package aula04;

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
    
        public int  getQuantity() {
            return quantity;
        }
    }
    
    
    class CashRegister {
        Product[] products;
        int count;

        public CashRegister(){
            count = 0;
            products = new Product[10];
        }

        public void addProduct(Product p){
            products[count] = p;
            count += 1;
        }


        public String toString(){

            String result = "";
            double totalValue = 0.0;

            result = "".format("%-20s %5s %10s %10s\n", "Product", "Price", "Quantity", "Total");

            for(int i = 0; i < count; i++){
                result += "".format("%-20s %5.2f %10d %10.2f\n", products[i].getName(), products[i].getPrice(), products[i].getQuantity(), products[i].getTotalValue());

                totalValue += products[i].getTotalValue();
            }

            result += "".format("Total value %.2f", totalValue);
            return result;
            
        }
        
    
    }
    
    public class Ex2 {
        public static void main(String[]args) {
    
            // Cria e adiciona 5 produtos
            CashRegister cr = new CashRegister();
            cr.addProduct(new Product("Book", 9.99, 3));
            cr.addProduct(new Product("Pen", 1.99, 10));
            cr.addProduct(new Product("Headphones", 29.99, 2));
            cr.addProduct(new Product("Notebook", 19.99, 5));
            cr.addProduct(new Product("Phone case", 5.99, 1));
            
            // TODO: Listar o conteúdo e valor total
            System.out.println(cr);
    
        }
    }
