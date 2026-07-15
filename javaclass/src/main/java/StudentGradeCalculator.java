public class StudentGradeCalculator {
    public static void main(String[] args){
        double grade1=85;
        double grade2=90;
        double grade3=80;
        double average=0;
        String status="";
        average = (grade1+grade2+grade3)/3;
        if (average >= 90) {
            status = "Excellent";
        } else if (average >= 75) {
            status = "Good";
        } else if (average >= 60) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + average);
        System.out.println("Status: " + status);

 }
}


