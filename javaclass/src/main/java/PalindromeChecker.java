import java.util.ArrayList;

public class PalindromeChecker {
    public static void main(String[] args) {
        String nums = IO.readln("enter the numbers");
        String revers = " ";
        int count = 0;
        for (int i = nums.length() - 1; i >= 0; i--) {
            revers = revers + nums.charAt(i);
        }
        IO.println("Reverse: " + revers);
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) == revers.charAt(i)) {
                count++;
            }
        }
            if (count == nums.length()) {
                IO.println("The number is a palindrome");
            } else {
                IO.println("The number is not a palindrome");
            }

        }
    }

