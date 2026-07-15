public class DigitFrequencyCounter{
    public static void main(String[] args){
        String num= IO.readln("enter the number");
        int result= new Integer(num) ;
        int[] frequency = new int[10];

        int i = 0;

        // Count frequency of each digit
        while (i < num.length()) {
            int digit = Character.getNumericValue(num.charAt(i));
            
            frequency[digit] = frequency[digit] + 1;

            i = i + 1;
        }

        i = 0;

        // Display frequency
        while (i < 10) {
            if (frequency[i] > 0) {
                System.out.println(i + " appears " + frequency[i] + " times");
            }

            i = i + 1;
        }
        }
    }


