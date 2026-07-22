import java.util.ArrayList;
import java.util.Scanner;
public class Bank_Transaction {
    void main(String[] args){
        ArrayList<Integer> accountNumbers = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Double> balances = new ArrayList<>();
        ArrayList<String> accountTypes = new ArrayList<>();
        ArrayList<String> accountStatus = new ArrayList<>();
        accountNumbers.add(10001);
        customerNames.add("Ali");
        balances.add(2500.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");

        accountNumbers.add(10002);
        customerNames.add("Sara");
        balances.add(4200.0);
        accountTypes.add("Current");
        accountStatus.add("Active");
        for (int i = 0; i < accountNumbers.size(); i++) {

            System.out.println("Account Index: " + i);
            System.out.println("Account Number: " + accountNumbers.get(i));
            System.out.println("Customer: " + customerNames.get(i));
            System.out.println("Type: " + accountTypes.get(i));
            System.out.println("Balance: " + balances.get(i));
            System.out.println("Status: " + accountStatus.get(i));
            System.out.println();

            String input1=IO.readln("enter your name");
            int name=new Integer(input1);

            String input2=IO.readln("enter intial balance");
            int balance=new Integer(input2);

            String input3=IO.readln("enter acount type");
            int acount=new Integer(input3);

            if (balance < 0) {
                System.out.println("Invalid balance.");
            }

            if (!input1.equalsIgnoreCase("Savings") && !input1.equalsIgnoreCase("Current")) {

                System.out.println("Invalid account type.");
            }



        }
    }
}
