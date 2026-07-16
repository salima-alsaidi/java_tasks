public class StudentResultAnalyzer {

     static boolean validateMarks(int mark1, int mark2, int mark3) {
                if (mark1 >= 0 && mark1 <= 100 &&
                        mark2 >= 0 && mark2 <= 100 &&
                        mark3 >= 0 && mark3 <= 100) {
                    return true;
                } else {
                    return false;
                }
            }

            static int calculateTotal(int mark1, int mark2, int mark3) {
                return mark1 + mark2 + mark3;
            }

            static double calculateAverage(int totalMarks, int numberOfSubjects) {
                return (double) totalMarks / numberOfSubjects;
            }

            static String calculateGrade(double averageMark) {
                if (averageMark >= 90) {
                    return "A";
                } else if (averageMark >= 80) {
                    return "B";
                } else if (averageMark >= 70) {
                    return "C";
                } else if (averageMark >= 60) {
                    return "D";
                } else {
                    return "F";
                }
            }

            static String checkPerformance(String grade) {
                if (grade.equals("A")) {
                    return "Excellent";
                } else if (grade.equals("B")) {
                    return "Very Good";
                } else if (grade.equals("C")) {
                    return "Good";
                } else if (grade.equals("D")) {
                    return "Satisfactory";
                } else {
                    return "Needs Improvement";
                }
            }

            static void displayReport(String studentName, int mark1, int mark2,
                                      int mark3, int totalMarks,
                                      double averageMark, String grade,
                                      String performance) {

                System.out.println("===== Student Report =====");
                System.out.println("Student Name       : " + studentName);
                System.out.println("Subject 1 Marks    : " + mark1);
                System.out.println("Subject 2 Marks    : " + mark2);
                System.out.println("Subject 3 Marks    : " + mark3);
                System.out.println("Total Marks        : " + totalMarks);
                System.out.println("Average Marks      : " + averageMark);
                System.out.println("Final Grade        : " + grade);
                System.out.println("Performance Status : " + performance);
            }

            public static void main(String[] args) {

                String studentName = "Ali";

                int mark1 = 85;
                int mark2 = 90;
                int mark3 = 75;

                int totalMarks;
                double averageMark;
                String grade;
                String performance;

                if (validateMarks(mark1, mark2, mark3)) {

                    totalMarks = calculateTotal(mark1, mark2, mark3);

                    averageMark = calculateAverage(totalMarks, 3);

                    grade = calculateGrade(averageMark);

                    performance = checkPerformance(grade);

                    displayReport(studentName, mark1, mark2, mark3,
                            totalMarks, averageMark, grade, performance);

                } else {

                    System.out.println("Invalid marks. Please check the student grades.");
                }
            }
        }


