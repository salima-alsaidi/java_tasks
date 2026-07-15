public class DecimalToBinary {
    public static void main(String[] args){
        String binary = "";
       String num= IO.readln("enter the number");
       int result= new Integer(num) ;
       while(result>0){

           if(result%2==1){
               binary = binary + "1";
           }else {
               binary = binary + "0";

           }
            result=result/2;
       }
        IO.println(binary);

    }
}
