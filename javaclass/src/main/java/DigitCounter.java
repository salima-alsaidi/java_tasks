public class DigitCounter {
    public static void main(String[] args){

    String number="12345";
    int count =0;
    for(int i=0; i <= number.length()-1; i++) {
        IO.println(number.charAt(i));

        count++;
    }
        IO.println("Original number: " + number);
        IO.println("Number of digits: " + count);
    }
}
