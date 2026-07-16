import java.util.ArrayList;
import java.util.Scanner;
public class ProductInventorySystem {

        static double calculateTotalValue(ArrayList<Double> prices, ArrayList<Integer> quantities) {

            double total = 0;

            for (int i = 0; i < prices.size(); i++) {
                total = total + (prices.get(i) * quantities.get(i));
            }

            return total;
        }


        // Check product stock status
        static String checkStockStatus(int quantity) {

            if (quantity > 10) {
                return "High Stock";
            }
            else if (quantity > 0) {
                return "Available";
            }
            else {
                return "Out of Stock";
            }
        }


        // Find the most expensive product
        static String findMostExpensiveProduct(ArrayList<String> names,
                ArrayList<Double> prices) {

            int position = 0;

            for (int i = 1; i < prices.size(); i++) {

                if (prices.get(i) > prices.get(position)) {
                    position = i;
                }
            }

            return names.get(position);
        }


        // Display inventory report
        static void displayReport(ArrayList<String> names,
                ArrayList<Double> prices,
                ArrayList<Integer> quantities,
        double totalValue,
        int available,
        int outStock,
        String expensiveProduct) {


            System.out.println("\n====== Inventory Report ======");


            for (int i = 0; i < names.size(); i++) {

                System.out.println("\nProduct Name: " + names.get(i));
                System.out.println("Price: " + prices.get(i));
                System.out.println("Quantity: " + quantities.get(i));
                System.out.println("Status: " + checkStockStatus(quantities.get(i)));
            }


            System.out.println("\n====== Summary ======");
            System.out.println("Total Inventory Value: " + totalValue);
            System.out.println("Available Products: " + available);
            System.out.println("Out of Stock Products: " + outStock);
            System.out.println("Most Expensive Product: " + expensiveProduct);
        }


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            // Create lists
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantities = new ArrayList<>();


            int available = 0;
            int outStock = 0;


            // Enter 10 products
            for (int i = 0; i < 10; i++) {

                System.out.println("\nEnter Product " + (i + 1));

                System.out.print("Product Name: ");
                names.add(input.nextLine());

                System.out.print("Product Price: ");
                prices.add(input.nextDouble());

                System.out.print("Product Quantity: ");
                int quantity = input.nextInt();

                quantities.add(quantity);

                input.nextLine();


                // Count stock
                if (quantity > 0) {
                    available++;
                }
                else {
                    outStock++;
                }
            }


            // Calculate total value
            double totalValue = calculateTotalValue(prices, quantities);


            // Find expensive product
            String expensiveProduct = findMostExpensiveProduct(names, prices);


            // Display report
            displayReport(names, prices, quantities,
                    totalValue, available,
                    outStock, expensiveProduct);



        }
}
