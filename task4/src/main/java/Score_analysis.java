import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Score_analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Create Score List
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(60);
        scores.add(45);
        scores.add(88);
        scores.add(100);
        scores.add(55);
        scores.add(73);
        scores.add(92);
        scores.add(67);
        scores.add(81);
        scores.add(49);
        scores.add(76);
        scores.add(85);

        System.out.println("Total Scores: " + scores.size());

        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + i + ": " + scores.get(i));
        }

        int total = 0;
        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int score : scores) {

            total += score;

            if (score > highest)
                highest = score;

            if (score < lowest)
                lowest = score;
        }

        double average = (double) total / scores.size();

        System.out.println("Total Score: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        int passed = 0;
        int failed = 0;
        int excellent = 0;
        int lowGrades = 0;

        for (int score : scores) {

            if (score >= 60)
                passed++;
            else
                failed++;

            if (score >= 90)
                excellent++;

            if (score < 50)
                lowGrades++;
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Excellent: " + excellent);
        System.out.println("Low Grades: " + lowGrades);

        System.out.print("Enter score: ");
        int search = input.nextInt();

        if (scores.contains(search)) {

            int firstIndex = scores.indexOf(search);

            int count = 0;
            for (int score : scores) {
                if (score == search)
                    count++;
            }

            System.out.println("Score found.");
            System.out.println("First Position: " + firstIndex);
            System.out.println("Occurrences: " + count);

        } else {
            System.out.println("Score not found.");
        }


        System.out.print("Enter index: ");
        int index = input.nextInt();

        if (index >= 0 && index < scores.size()) {

            System.out.print("Enter new score: ");
            int newScore = input.nextInt();

            scores.set(index, newScore);

            System.out.println("Updated Scores:");
            System.out.println(scores);

        } else {
            System.out.println("Invalid index.");
        }


        System.out.print("Enter score to remove: ");
        int removeScore = input.nextInt();

        scores.remove(Integer.valueOf(removeScore));

        System.out.println("After removing by value:");
        System.out.println(scores);

        System.out.print("Enter index to remove: ");
        int removeIndex = input.nextInt();

        if (removeIndex >= 0 && removeIndex < scores.size()) {

            scores.remove(removeIndex);

            System.out.println("After removing by index:");
            System.out.println(scores);

        } else {
            System.out.println("Invalid index.");
        }

        // 8. Sorting and Reversing
        System.out.println("\n===== SORTING =====");

        ArrayList<Integer> sortedScores = new ArrayList<>(scores);

        Collections.sort(sortedScores);

        System.out.println("Ascending:");
        System.out.println(sortedScores);

        Collections.reverse(sortedScores);

        System.out.println("Descending:");
        System.out.println(sortedScores);

        // 9. Clear Data
        System.out.println("\n===== CLEAR SCORES =====");

        scores.clear();

        System.out.println("After Clear:");
        System.out.println(scores);

        System.out.println("Is Empty: " + scores.isEmpty());

    }
}

