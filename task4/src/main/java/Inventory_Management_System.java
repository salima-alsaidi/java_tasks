import java.util.ArrayList;
import java.util.Scanner;
public class Inventory_Management_System {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();

        productNames.add("Laptop");
        productQuantities.add(5);
        productPrices.add(750.50);

        productNames.add("Mouse");
        productQuantities.add(20);
        productPrices.add(15.50);

        productNames.add("Keyboard");
        productQuantities.add(10);
        productPrices.add(25.00);

        productNames.add("Monitor");
        productQuantities.add(8);
        productPrices.add(180.00);

        productNames.add("Printer");
        productQuantities.add(0);
        productPrices.add(150.00);

        productNames.add("Speaker");
        productQuantities.add(12);
        productPrices.add(45.00);

        productNames.add("Webcam");
        productQuantities.add(3);
        productPrices.add(35.50);

        productNames.add("SSD");
        productQuantities.add(15);
        productPrices.add(95.00);

        productNames.add("Hard Drive");
        productQuantities.add(7);
        productPrices.add(80.00);

        productNames.add("USB");
        productQuantities.add(25);
        productPrices.add(10.00);

        System.out.println("===== INVENTORY =====");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println("Product " + i);
            System.out.println("Name: " + productNames.get(i));
            System.out.println("Quantity: " + productQuantities.get(i));
            System.out.println("Price: " + productPrices.get(i));
            System.out.println();
        }

        // 3. Add Product
        System.out.println("===== ADD PRODUCT =====");

        System.out.print("Enter Product Name: ");
        String name = input.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();

        productNames.add(name);
        productQuantities.add(quantity);
        productPrices.add(price);

        System.out.println("Product added successfully.");

        // 4. Update Product
        System.out.println("\n===== UPDATE PRODUCT =====");

        System.out.print("Enter Product Index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 0 && index < productNames.size()) {

            System.out.print("New Product Name: ");
            String newName = input.nextLine();

            System.out.print("New Quantity: ");
            int newQuantity = input.nextInt();

            System.out.print("New Price: ");
            double newPrice = input.nextDouble();

            productNames.set(index, newName);
            productQuantities.set(index, newQuantity);
            productPrices.set(index, newPrice);

            System.out.println("Product updated successfully.");

        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\n===== SEARCH PRODUCT =====");

        input.nextLine();

        System.out.print("Enter Product Name: ");
        String search = input.nextLine();

        if (productNames.contains(search)) {

            int position = productNames.indexOf(search);

            System.out.println("Product Found");
            System.out.println("Index: " + position);
            System.out.println("Quantity: " + productQuantities.get(position));
            System.out.println("Price: " + productPrices.get(position));

        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n===== STOCK ANALYSIS =====");

        int totalQuantity = 0;
        double inventoryValue = 0;

        for (int i = 0; i < productNames.size(); i++) {

            totalQuantity += productQuantities.get(i);
            inventoryValue += productQuantities.get(i) * productPrices.get(i);
        }

        System.out.println("Total Products: " + productNames.size());
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Inventory Value: " + inventoryValue);

        System.out.println("\n===== STOCK STATUS =====");

        System.out.println("Low Stock:");
        for (int i = 0; i < productNames.size(); i++) {
            if (productQuantities.get(i) < 5) {
                System.out.println(productNames.get(i));
            }
        }

        System.out.println("\nOut Of Stock:");
        for (int i = 0; i < productNames.size(); i++) {
            if (productQuantities.get(i) == 0) {
                System.out.println(productNames.get(i));
            }
        }

        System.out.println("\nAvailable Stock:");
        for (int i = 0; i < productNames.size(); i++) {
            if (productQuantities.get(i) > 0) {
                System.out.println(productNames.get(i));
            }
        }

        System.out.println("\n===== REMOVE PRODUCT =====");

        System.out.print("Enter Product Index: ");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < productNames.size()) {

            productNames.remove(removeIndex);
            productQuantities.remove(removeIndex);
            productPrices.remove(removeIndex);

            System.out.println("Product removed successfully.");

        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nUpdated Inventory:");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println(productNames.get(i) + "  "
                    + productQuantities.get(i) + "  "
                    + productPrices.get(i));
        }

        System.out.println("\n===== SORT PRODUCTS BY NAME =====");

        for (int i = 0; i < productNames.size() - 1; i++) {

            for (int j = i + 1; j < productNames.size(); j++) {

                if (productNames.get(i).compareTo(productNames.get(j)) > 0) {

                    String tempName = productNames.get(i);
                    productNames.set(i, productNames.get(j));
                    productNames.set(j, tempName);

                    int tempQuantity = productQuantities.get(i);
                    productQuantities.set(i, productQuantities.get(j));
                    productQuantities.set(j, tempQuantity);

                    double tempPrice = productPrices.get(i);
                    productPrices.set(i, productPrices.get(j));
                    productPrices.set(j, tempPrice);
                }
            }
        }

        System.out.println("Sorted Inventory:");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println(productNames.get(i) + "  "
                    + productQuantities.get(i) + "  "
                    + productPrices.get(i));
        }

        input.close();
    }
}


