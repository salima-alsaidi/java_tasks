import java.util.ArrayList;
import java.util.Scanner;


public class Library_Management_System {
    ArrayList<String> book_title=new ArrayList<>();
    ArrayList<String> authors=new ArrayList<>();
    ArrayList<Boolean> availability=new ArrayList<>();
     void main(String[] args){
         Scanner input = new Scanner(System.in);

         // 1. Create Book Lists
         ArrayList<String> bookTitles = new ArrayList<>();
         ArrayList<String> authors = new ArrayList<>();
         ArrayList<Boolean> availability = new ArrayList<>();

         // Add 10 books

         bookTitles.add("Java Programming");
         authors.add("James");
         availability.add(true);

         bookTitles.add("Database System");
         authors.add("John");
         availability.add(false);

         bookTitles.add("Computer Networks");
         authors.add("Andrew");
         availability.add(true);

         bookTitles.add("Advanced Java");
         authors.add("Ahmed");
         availability.add(false);

         bookTitles.add("Data Structures");
         authors.add("Robert");
         availability.add(true);

         bookTitles.add("Operating System");
         authors.add("William");
         availability.add(true);

         bookTitles.add("Artificial Intelligence");
         authors.add("David");
         availability.add(false);

         bookTitles.add("Software Engineering");
         authors.add("Martin");
         availability.add(true);

         bookTitles.add("Web Development");
         authors.add("Chris");
         availability.add(true);

         bookTitles.add("Cyber Security");
         authors.add("Michael");
         availability.add(false);


         // 2. Display Library Books
         System.out.println("===== LIBRARY BOOKS =====");

         for (int i = 0; i < bookTitles.size(); i++) {

             System.out.println("Book " + i);
             System.out.println("Title: " + bookTitles.get(i));
             System.out.println("Author: " + authors.get(i));

             if (availability.get(i)) {
                 System.out.println("Available: Yes");
             } else {
                 System.out.println("Available: No");
             }

             System.out.println();
         }


         // 3. Add New Book
         System.out.println("===== ADD NEW BOOK =====");

         input.nextLine();

         System.out.print("Enter Book Title: ");
         String title = input.nextLine();

         System.out.print("Enter Author: ");
         String author = input.nextLine();

         System.out.print("Available (true/false): ");
         boolean available = input.nextBoolean();


         bookTitles.add(title);
         authors.add(author);
         availability.add(available);


         System.out.println("Book added successfully.");


         // Display updated library

         System.out.println("\nUpdated Library:");

         for (int i = 0; i < bookTitles.size(); i++) {

             System.out.println(i + " - "
                     + bookTitles.get(i) + " - "
                     + authors.get(i) + " - "
                     + availability.get(i));

         }


         // 4. Update Book Information
         System.out.println("\n===== UPDATE BOOK =====");

         System.out.print("Enter Book Index: ");
         int index = input.nextInt();

         input.nextLine();

         if (index >= 0 && index < bookTitles.size()) {


             System.out.print("New Title: ");
             String newTitle = input.nextLine();


             System.out.print("New Author: ");
             String newAuthor = input.nextLine();


             System.out.print("Available (true/false): ");
             boolean newAvailability = input.nextBoolean();


             bookTitles.set(index, newTitle);
             authors.set(index, newAuthor);
             availability.set(index, newAvailability);


             System.out.println("Book updated successfully.");

         }
         else {

             System.out.println("Invalid book index.");

         }


         // 5. Search Book

         System.out.println("\n===== SEARCH BOOK =====");

         input.nextLine();

         System.out.print("Enter Book Title: ");
         String searchTitle = input.nextLine();


         if (bookTitles.contains(searchTitle)) {


             int position = bookTitles.indexOf(searchTitle);


             System.out.println("Book Found.");

             System.out.println("Index: " + position);

             System.out.println("Author: "
                     + authors.get(position));

             System.out.println("Available: "
                     + availability.get(position));


         }
         else {

             System.out.println("Book not found.");

         }




     }
}





