import java.util.ArrayList;
import java.util.Arrays;

public class AnalysisSystem {
    public static void main(String[] args) {
        int[] number = {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};
        int sum = 0;
        int count = 0;
        int average = 0;
        int max = number[0];
        int min = number[0];
        int positive = 0;
        int negetive = 0;
        int even = 0;
        int odd = 0;
        boolean found = false;

        IO.println("first element is:" + number[0]);
        IO.println("last element is:" + number[number.length - 1]);
        for (int i = 0; i <= number.length - 1; i++) {
            count = count + 1;
            sum = sum + number[i];
            IO.println("index" + i + " " + number[i]);
            average = sum / count;
        }
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }

        IO.println("sum of elemnts is:" + sum);
        IO.println("number of elemnts is:" + count);
        IO.println("the average of numbers is :" + average);
        IO.println("the largest number is  :" + max);
        IO.println("the smallest number is  :" + min);

        String input = IO.readln("enter the number you want to search: ");
        int num = new Integer(input);
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                positive++;
            } else if (number[i] < 0) {
                negetive++;
            } else {
                IO.println(0);
            }
            if (number[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (num == number[i]) {
                IO.println("Found at index " + i);
                found = true;

            }

        }
        if (!found) {
            IO.println("Number not found");
        }
        String pair = IO.readln("Enter (value to replace, new value): ");
            pair = pair.replace("(", "").replace(")", "");

            String[] values = pair.split(",");

            int oldValue = Integer.parseInt(values[0]);
            int newValue = Integer.parseInt(values[1]);

        for (int i = 0; i < number.length; i++) {
            if (number[i] == oldValue) {
                number[i] = newValue;   // Replace the value
                found = true;
                break;                   // Remove this line to replace all occurrences
            }
        }

        if (found) {
            System.out.println("Updated Array:");

            for (int i = 0; i < number.length; i++) {
                System.out.print(number[i] + " ");
            }
        } else {
            System.out.println("Value not found.");
        }

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(" the reverse of list is" + number[i] + " ");
        }
        int[] copyArray = Arrays.copyOf(number, number.length);

        Arrays.sort(copyArray);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(number));

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(copyArray));

        System.out.println("Smallest Value: " + copyArray[0]);
        System.out.println("Largest Value: " + copyArray[copyArray.length - 1]);



        }
    }
        




