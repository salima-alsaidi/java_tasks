public class CircleCalculator {
    public static void main(String[] args){
        String input = IO.readln("enter the radius");
        int radius = new Integer(input);
        double area=0;
        double circumference=0;

        if(radius >0){
             area = 3.14*radius*radius;
             circumference=2*3.14*radius;
            IO.println(area);
            IO.println(circumference);
        }else {
            IO.println("Invalid radius. Radius must be \n" +
                    "greater than zero.");
        }

    }
}
