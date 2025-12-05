package solutions;

import java.util.Arrays;

public class Solution2 {
    //Create class Product (pid, price, quantity) with parameterized constructor. Create a main function in different class (say ProductMain ) and perform following task
    // a. Accept five product information from user and store in an array
    // b. Find Pid of the product with the highest price.
    // c. Create method (with array of product's object as argument) in ProductMain class to calculate and return the total amount spent on all products. (amount spent on single product=price of product * quantity of product

    public static void main(String[] args) {
        createClass();
    }

    //input - price
    //outputt - 1000
    public static void createClass() {
    }


    // Product class
    static class Product {
        int pid;
        double price;
        int quantity;

        // Parameterized constructor
        public Product(int pid, double price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
    }

    // ProductMain class
    public class ProductMain {
        public static void main(String[] args) {
            // Create an array of Product objects
            Product[] products = new Product[]{
                    new Product(1, 1000, 2),
                    new Product(2, 500, 3),
                    new Product(3, 2000, 1),
                    new Product(4, 800, 4),
                    new Product(5, 1500, 2),
                    new Product(6, 2500, 1),
                    new Product(7, 3000, 1),
                    new Product(8, 1200, 3),
                    new Product(9, 1800, 2),
                    new Product(10, 2200, 1)
            };

            // a. Accept five products with the highest price
            Product[] topFiveProducts = getTopFiveProducts(products);
            System.out.println("Top 5 products with highest price:");
            for (Product product : topFiveProducts) {
                System.out.println("PID: " + product.pid + ", Price: " + product.price + ", Quantity: " + product.quantity);
            }

            // b. Find PID of the product with the highest price
            int pidOfHighestPricedProduct = getPidOfHighestPricedProduct(products);
            System.out.println("\nPID of product with highest price: " + pidOfHighestPricedProduct);

            // c. Calculate total amount spent on all products
            double totalAmount = calculateTotalAmount(products);
            System.out.println("\nTotal amount spent on all products: " + totalAmount);
        }

        // Method to get top 5 products with the highest price
        public static Product[] getTopFiveProducts(Product[] products) {
            Arrays.sort(products, (p1, p2) -> Double.compare(p2.price, p1.price));
            return Arrays.copyOfRange(products, 0, 5);
        }

        // Method to get PID of product with the highest price
        public static int getPidOfHighestPricedProduct(Product[] products) {
            Product highestPricedProduct = Arrays.stream(products).max((p1, p2) -> Double.compare(p1.price, p2.price)).orElse(null);
            return highestPricedProduct.pid;
        }

        // Method to calculate total amount spent on all products
        public static double calculateTotalAmount(Product[] products) {
            double totalAmount = 0;
            for (Product product : products) {
                totalAmount += product.price * product.quantity;
            }
            return totalAmount;
        }
    }
}