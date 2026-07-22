import java.util.ArrayList;
import java.util.Scanner;
public class Salary_Management_System {
    void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> employeeNames = new ArrayList<>();
        ArrayList<Integer> employeeIds = new ArrayList<>();
        ArrayList<Double> employeeSalaries = new ArrayList<>();

        employeeIds.add(1001);
        employeeNames.add("Ali");
        employeeSalaries.add(850.0);

        employeeIds.add(1002);
        employeeNames.add("Sara");
        employeeSalaries.add(1200.0);

        employeeIds.add(1003);
        employeeNames.add("Ahmed");
        employeeSalaries.add(950.0);

        employeeIds.add(1004);
        employeeNames.add("Mona");
        employeeSalaries.add(450.0);

        employeeIds.add(1005);
        employeeNames.add("Omar");
        employeeSalaries.add(700.0);

        employeeIds.add(1006);
        employeeNames.add("Khalid");
        employeeSalaries.add(1500.0);

        employeeIds.add(1007);
        employeeNames.add("Fatima");
        employeeSalaries.add(650.0);

        employeeIds.add(1008);
        employeeNames.add("Yousef");
        employeeSalaries.add(500.0);

        employeeIds.add(1009);
        employeeNames.add("Aisha");
        employeeSalaries.add(400.0);

        employeeIds.add(1010);
        employeeNames.add("Hassan");
        employeeSalaries.add(1100.0);

        System.out.println("===== EMPLOYEE INFORMATION =====");

        for (int i = 0; i < employeeNames.size(); i++) {

            System.out.println("Employee " + i);
            System.out.println("ID: " + employeeIds.get(i));
            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + employeeSalaries.get(i));
            System.out.println();
        }

        double totalSalary = 0;
        double highestSalary = employeeSalaries.get(0);
        double lowestSalary = employeeSalaries.get(0);

        for (double salary : employeeSalaries) {

            totalSalary += salary;

            if (salary > highestSalary)
                highestSalary = salary;

            if (salary < lowestSalary)
                lowestSalary = salary;
        }

        double averageSalary = totalSalary / employeeSalaries.size();

        System.out.println("===== SALARY STATISTICS =====");
        System.out.println("Total Employees: " + employeeNames.size());
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Highest Salary: " + highestSalary);
        System.out.println("Lowest Salary: " + lowestSalary);

        int high = 0;
        int medium = 0;
        int low = 0;

        for (double salary : employeeSalaries) {

            if (salary > 1000)
                high++;
            else if (salary >= 500)
                medium++;
            else
                low++;
        }

        System.out.println("\n===== SALARY CATEGORY =====");
        System.out.println("High Salary Employees: " + high);
        System.out.println("Medium Salary Employees: " + medium);
        System.out.println("Low Salary Employees: " + low);

        System.out.println("\n===== SEARCH EMPLOYEE =====");

        System.out.print("Enter Employee ID: ");
        int searchId = input.nextInt();

        if (employeeIds.contains(searchId)) {

            int position = employeeIds.indexOf(searchId);

            System.out.println("Employee Found");
            System.out.println("Name: " + employeeNames.get(position));
            System.out.println("Salary: " + employeeSalaries.get(position));
            System.out.println("Position: " + position);

        } else {

            System.out.println("Employee not found.");
        }

        System.out.println("\n===== UPDATE SALARY =====");

        System.out.print("Enter Employee Index: ");
        int index = input.nextInt();

        if (index >= 0 && index < employeeNames.size()) {

            System.out.print("Enter New Salary: ");
            double newSalary = input.nextDouble();

            employeeSalaries.set(index, newSalary);

            System.out.println("Salary updated successfully.");

            System.out.println(employeeNames.get(index) + " : "
                    + employeeSalaries.get(index));

        } else {

            System.out.println("Invalid index.");
        }

        System.out.println("\n===== REMOVE EMPLOYEE =====");

        System.out.print("Enter Employee Index: ");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < employeeNames.size()) {

            employeeIds.remove(removeIndex);
            employeeNames.remove(removeIndex);
            employeeSalaries.remove(removeIndex);

            System.out.println("Employee removed successfully.");

        } else {

            System.out.println("Invalid index.");
        }

        System.out.println("\nUpdated Employee List");

        for (int i = 0; i < employeeNames.size(); i++) {

            System.out.println(employeeIds.get(i) + " "
                    + employeeNames.get(i) + " "
                    + employeeSalaries.get(i));
        }

        for (int i = 0; i < employeeSalaries.size() - 1; i++) {

            for (int j = i + 1; j < employeeSalaries.size(); j++) {

                if (employeeSalaries.get(i) > employeeSalaries.get(j)) {

                    double tempSalary = employeeSalaries.get(i);
                    employeeSalaries.set(i, employeeSalaries.get(j));
                    employeeSalaries.set(j, tempSalary);

                    String tempName = employeeNames.get(i);
                    employeeNames.set(i, employeeNames.get(j));
                    employeeNames.set(j, tempName);

                    int tempId = employeeIds.get(i);
                    employeeIds.set(i, employeeIds.get(j));
                    employeeIds.set(j, tempId);
                }
            }
        }

        System.out.println("\n===== SALARY (LOW TO HIGH) =====");

        for (int i = 0; i < employeeNames.size(); i++) {

            System.out.println(employeeNames.get(i) + " - "
                    + employeeSalaries.get(i));
        }

        System.out.println("\n===== SALARY (HIGH TO LOW) =====");

        for (int i = employeeNames.size() - 1; i >= 0; i--) {

            System.out.println(employeeNames.get(i) + " - "
                    + employeeSalaries.get(i));
        }

        System.out.println("\n===== BONUS REPORT =====");

        for (int i = 0; i < employeeNames.size(); i++) {

            double salary = employeeSalaries.get(i);
            double bonus;

            if (salary >= 1000)
                bonus = salary * 0.10;
            else if (salary >= 500)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double finalSalary = salary + bonus;

            System.out.println("Employee: " + employeeNames.get(i));
            System.out.println("Current Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Final Salary: " + finalSalary);
            System.out.println();
        }

        input.close();
    }
}


