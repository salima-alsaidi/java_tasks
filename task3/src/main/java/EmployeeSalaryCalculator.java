public class EmployeeSalaryCalculator {

 static  int  calculateNetSalary(int basicSalary, int bonus, int deduction) {
        return basicSalary + bonus - deduction;
    }


    static String checkSalaryStatus(int netSalary) {
        if (netSalary < 500) {
            return "Low Salary";
        } else if (netSalary <= 1500) {
            return "Medium Salary";
        } else {
            return "High Salary";
        }
    }


    public static void main(String[] args){
        String input1 = IO.readln("enter emplyess name");
        String emplyess_name = new String(input1);
        String input2 = IO.readln("enter basic salary");
        int basicsalary = new Integer(input2);
        String input3 = IO.readln("enter Bonus amount  ");
        int Bonus = new Integer(input3);
        String input4 = IO.readln("enter o Deduction amount  ");
        Integer  Deduction=new Integer(input1);

        int netSalary = calculateNetSalary(basicsalary, Bonus, Deduction);
        String salaryStatus = checkSalaryStatus(netSalary);

        IO.println("Employee Name: " + emplyess_name);
        IO.println("Net Salary: " + netSalary);
        IO.println("Salary Status: " + salaryStatus);





    }
}
