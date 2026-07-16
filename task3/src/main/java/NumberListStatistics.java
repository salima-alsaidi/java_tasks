import java.util.ArrayList;

import java.util.ArrayList;

public class NumberListStatistics {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int totalSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        // Add 20 numbers to the list
        for(int i = 0; i < 20; i++) {
            String num = IO.readln("Enter a number: ");
            int listNumber = Integer.parseInt(num);
            numbers.add(listNumber);
        }

        // Initialize largest and smallest after adding values
        int largestNumber = numbers.get(0);
        int smallestNumber = numbers.get(0);

        // Analyze numbers
        for (int number : numbers) {

            totalSum = totalSum + number;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            if (number > largestNumber) {
                largestNumber = number;
            }

            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        double averageValue = (double) totalSum / numbers.size();

        IO.println("Numbers in the list:");

        for (int number : numbers) {
            IO.print(number + " ");
        }

        IO.println("\nSum of numbers: " + totalSum);
        IO.println("Average value: " + averageValue);
        IO.println("Largest number: " + largestNumber);
        IO.println("Smallest number: " + smallestNumber);
        IO.println("Count of even numbers: " + evenCount);
        IO.println("Count of odd numbers: " + oddCount);
        IO.println("Count of positive numbers: " + positiveCount);
        IO.println("Count of negative numbers: " + negativeCount);
    }
}