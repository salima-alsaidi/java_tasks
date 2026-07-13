public class FactorialCalculator {
    public static void main(String[] args){
        int number=7;
        int factorial=1;
        int i=1;
        while(i<=number){
            factorial =factorial *i;
            i++;
        }
        System.out.println(i);
        System.out.println("the facorial is:"+factorial);


    }
}
