import java.util.ArrayList;

public class NumberReversal {
    public static void main(String[] args){
        ArrayList<String> numbers= new ArrayList<>();


        for(int i=1; i<=5; i++){
           String nums= IO.readln("enter the numbers");
            IO.println(nums);
            numbers.add(nums);
        }
        IO.println(numbers);
        IO.println(numbers.reversed());
        for(int i= numbers.size()-1; i>=0; i--){
            IO.print(numbers.get(i));
        }




    }
}
