import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BankAccountSystem {
    static void displayAccounts(List<Integer> accountNumbers,
                                List<String> customerNames,
                                List<Double> balances) {

        System.out.println("\n===== Account Details =====");

        for (int i = 0; i < accountNumbers.size(); i++) {

            System.out.println("Account Number : " + accountNumbers.get(i));
            System.out.println("Customer Name  : " + customerNames.get(i));
            System.out.println("Balance        : " + balances.get(i));
            System.out.println();
        }
    }

    // Deposit money
    static void depositMoney(List<Integer> accountNumbers,
                             List<Double> balances,
                             int accountNumber,
                             double amount) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {

                balances.set(i, balances.get(i) + amount);

                System.out.println("Money deposited successfully.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Withdraw money
    static void withdrawMoney(List<Integer> accountNumbers,
                              List<Double> balances,
                              int accountNumber,
                              double amount) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {

                if (balances.get(i) >= amount) {

                    balances.set(i, balances.get(i) - amount);

                    System.out.println("Withdrawal successful.");
                } else {

                    System.out.println("Insufficient balance.");
                }

                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Check balance
    static void checkBalance(List<Integer> accountNumbers,
                             List<Double> balances,
                             int accountNumber) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {

                System.out.println("Current Balance: " + balances.get(i));
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Display statistics
    static void calculateStatistics(List<Double> balances) {

        double total = 0;
        double highest = balances.get(0);
        double lowest = balances.get(0);

        for (int i = 0; i < balances.size(); i++) {

            total = total + balances.get(i);

            if (balances.get(i) > highest) {
                highest = balances.get(i);
            }

            if (balances.get(i) < lowest) {
                lowest = balances.get(i);
            }
        }

        System.out.println("\n===== Account Statistics =====");
        System.out.println("Total Money : " + total);
        System.out.println("Highest Balance : " + highest);
        System.out.println("Lowest Balance : " + lowest);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create lists
        List<Integer> accountNumbers = new ArrayList<>();
        List<String> customerNames = new ArrayList<>();
        List<Double> balances = new ArrayList<>();

        // Add 5 accounts
        accountNumbers.add(1001);
        customerNames.add("Ali");
        balances.add(1000.0);

        accountNumbers.add(1002);
        customerNames.add("Sara");
        balances.add(2000.0);

        accountNumbers.add(1003);
        customerNames.add("Ahmed");
        balances.add(1500.0);

        accountNumbers.add(1004);
        customerNames.add("Fatima");
        balances.add(2500.0);

        accountNumbers.add(1005);
        customerNames.add("John");
        balances.add(3000.0);

        int choice;

        do {

            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Statistics");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    displayAccounts(accountNumbers, customerNames, balances);
                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    int accountNumber = input.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = input.nextDouble();

                    depositMoney(accountNumbers, balances, accountNumber, amount);
                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    accountNumber = input.nextInt();

                    System.out.print("Enter Amount: ");
                    amount = input.nextDouble();

                    withdrawMoney(accountNumbers, balances, accountNumber, amount);
                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    accountNumber = input.nextInt();

                    checkBalance(accountNumbers, balances, accountNumber);
                    break;

                case 5:

                    calculateStatistics(balances);
                    break;

                case 6:

                    System.out.println("Thank you!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);


    }
}
