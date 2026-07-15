import java.util.ArrayList;

public class LargestNumberFinder {
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<>();


        for(int i=1; i<=5; i++){
            String nums= IO.readln("enter the numbers");
            IO.println(nums);
            numbers.add(Integer.parseInt(nums));
        }
        int largest = numbers.get(0);
        IO.println(numbers);
        for(int i=0; i<= numbers.size(); i++){
            if(numbers.get(i)>largest) {
                 largest = numbers.get(i);
                IO.println(largest);
            }
            }
        IO.println(largest);

    }
    }

