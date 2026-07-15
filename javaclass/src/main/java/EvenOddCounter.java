public class EvenOddCounter  {
    public static void main(String[] args){
        int odd=0;
        int even=0;
        for(int i=1; i<=5; i++){
            if(i%2==0){
                IO.println(i +"is even");
                even++;
            }else{
                IO.println(i +"is odd");
                odd++;
            }
        }
        IO.println("even numbers are:"+ even);
        IO.println("even numbers are:"+ odd);

    }
}
