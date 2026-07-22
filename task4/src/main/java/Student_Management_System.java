import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Student_Management_System {
    ArrayList<String> students=new ArrayList<>();
    int count=0;
    boolean found;
     void main(String[] args){
        students.add("ali");
        students.add("hamed");
        students.add("salim");
        students.add("sara");
         IO.println(students);

         for(int i=0; i<= students.size()-1;i++) {
                 IO.println(i + " " + students.get(i));
                 count++;


             }
             if (students==null){
                 IO.println("the list is empty");
             }else {
                 IO.println("the list contains an items");
                 IO.println("the first element is " + students.get(0));
                 IO.println("the last element is " + students.get(students.size()-1));
             }

         IO.println("total number of students is " + count);
         String new_students=IO.readln(" enter the name of students");
         students.add(1,new_students);
         IO.println(students);

         String input1=IO.readln(" enter the index of students you want to replace it");
         int index= new Integer(input1);
         String input2=IO.readln(" enter new students");
         students.set(index,input2);
         IO.println("new list: " + students);


         String input3=IO.readln(" enter the name of student you want to search");

         for(int i=0; i<= students.size()-1; i++){
             if (input3 == students.get(i)) {
                 IO.println("Found at index " + i);
                 found = true;
             }
         }
         if (!found) {
             IO.println("Number not found");
         }

         ArrayList<String> sortedStudents = new ArrayList<>(students);
         Collections.sort(sortedStudents);


         System.out.println("Original List:");
         System.out.println(students);

         System.out.println("Sorted List:");
         System.out.println(sortedStudents);





     }








     }


