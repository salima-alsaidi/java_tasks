import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManagementSystem {
    static void displayBooks(ArrayList<String> bookNames,
                             ArrayList<String> authorNames,
                             ArrayList<Boolean> availability) {


        for (int i = 0; i < bookNames.size(); i++) {

            System.out.println("Book Name: " + bookNames.get(i));
            System.out.println("Author: " + authorNames.get(i));

            if (availability.get(i)) {
                System.out.println("Status: Available");
            } else {
                System.out.println("Status: Not Available");
            }

            System.out.println();
        }
    }


    // Method to search for a book
    static void searchBook(String searchName,
                           ArrayList<String> bookNames) {

        boolean found = false;

        for (int i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(searchName)) {

                System.out.println("Book found: " + bookNames.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    // Method to borrow a book
    static void borrowBook(String bookName,
                           ArrayList<String> bookNames,
                           ArrayList<Boolean> availability) {

        for (int i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                if (availability.get(i)) {
                    availability.set(i, false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }


    // Method to return a book
    static void returnBook(String bookName,
                           ArrayList<String> bookNames,
                           ArrayList<Boolean> availability) {

        for (int i = 0; i < bookNames.size(); i++) {

            if (bookNames.get(i).equalsIgnoreCase(bookName)) {

                availability.set(i, true);
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }


    // Method to count available and unavailable books
    static int[] countBooks(ArrayList<Boolean> availability) {

        int available = 0;
        int unavailable = 0;

        for (int i = 0; i < availability.size(); i++) {

            if (availability.get(i)) {
                available++;
            } else {
                unavailable++;
            }
        }

        return new int[]{available, unavailable};
    }


    // Method to display library report
    static void displayReport(ArrayList<String> bookNames,
                              ArrayList<Boolean> availability) {

        int[] count = countBooks(availability);

        System.out.println("\n===== Library Report =====");
        System.out.println("Total Books: " + bookNames.size());
        System.out.println("Available Books: " + count[0]);
        System.out.println("Unavailable Books: " + count[1]);
    }


    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Create lists
        ArrayList<String> bookNames = new ArrayList<>();
        ArrayList<String> authorNames = new ArrayList<>();
        ArrayList<Boolean> availability = new ArrayList<>();


        // Add books to lists
        bookNames.add("Harry Potter");
        authorNames.add("J.K Rowling");
        availability.add(true);

        bookNames.add("The Hobbit");
        authorNames.add("J.R.R Tolkien");
        availability.add(true);

        bookNames.add("Java Programming");
        authorNames.add("James Gosling");
        availability.add(false);

        bookNames.add("Clean Code");
        authorNames.add("Robert Martin");
        availability.add(true);

        bookNames.add("Database Systems");
        authorNames.add("Korth");
        availability.add(false);

        bookNames.add("Artificial Intelligence");
        authorNames.add("Russell");
        availability.add(true);

        bookNames.add("C++ Basics");
        authorNames.add("Bjarne Stroustrup");
        availability.add(true);

        bookNames.add("The Alchemist");
        authorNames.add("Paulo Coelho");
        availability.add(false);

        bookNames.add("Programming Logic");
        authorNames.add("John Smith");
        availability.add(true);

        bookNames.add("Computer Networks");
        authorNames.add("Andrew Tanenbaum");
        availability.add(true);


        int choice;


        // Menu loop
        do {

            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Display All Books");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Report");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();


            // Switch case menu
            switch (choice) {

                case 1:
                    displayBooks(bookNames, authorNames, availability);
                    break;


                case 2:
                    System.out.print("Enter book name: ");
                    String search = input.nextLine();

                    searchBook(search, bookNames);
                    break;


                case 3:
                    System.out.print("Enter book name to borrow: ");
                    String borrow = input.nextLine();

                    borrowBook(borrow, bookNames, availability);
                    break;


                case 4:
                    System.out.print("Enter book name to return: ");
                    String returnBookName = input.nextLine();

                    returnBook(returnBookName, bookNames, availability);
                    break;


                case 5:
                    displayReport(bookNames, availability);
                    break;


                case 6:
                    System.out.println("Exiting Library System...");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }


        }while (choice != 6);

    }
}