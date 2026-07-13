import jdk.dynalink.beans.StaticClass;

public class EvenNumberAnalyzer {
    public static void main(String[]args){
        int sum=0;
        int count=0;
        for(int i=1; i<=20; i++){
            if(i%2==0){
                 sum =sum+i;
                 count = count +1;
                System.out.println("the even number is:" + i);


            }
        }
        System.out.println("the sum of even numbers is:" + sum);
        System.out.println("we have" + count + "of even number");


    }
}
