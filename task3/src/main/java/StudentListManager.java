import java.util.ArrayList;

public class StudentListManager {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<String>();

        for(int i=0; i<=5; i++) {
            String StudentName = IO.readln("enter name of student");
            students.add(StudentName);
        }
        for (int i = 0; i < students.size(); i++) {
            IO.println((i + 1) + ". " + students.get(i));
        }
        System.out.println("\nTotal number of students: " + students.size());

        System.out.println("First student: " + students.get(0));

        System.out.println("Last student: " + students.get(students.size() - 1));

        String searchStudent = "Sara";

        if (students.contains(searchStudent)) {
            System.out.println(searchStudent + " exists in the list.");
        } else {
            System.out.println(searchStudent + " does not exist in the list.");
        }

        String removedStudent = "John";
        students.remove(removedStudent);

        System.out.println("\n" + removedStudent + " has been removed.");

        System.out.println("\nUpdated Student List:");

        for (String student : students) {
            System.out.println(student);
        }


    }
}
