public class triangleCalculator {
    public static void main(String[] args) {
        String input1 = IO.readln("enter side1");
        int side1 = new Integer(input1);
        String input2 = IO.readln("enter side2");
        int side2 = new Integer(input2);
        String input3 = IO.readln("enter base");
        int base = new Integer(input3);
        String input4 = IO.readln("enter hight of tringle");
        int hight = new Integer(input4);
        double area = 0.5*base*hight;
        double perimeter = side1+side2+base;
        if (side1 > 0 && side2 > 0 && base > 0) {
            if (side1 == side2 && side2 == base && base == side1) {

                IO.println("perimeter:" + perimeter);
                IO.println("area:" + area);

            } else if (side1 == side2 || side2 == base || base == side1) {
                IO.println("Isosceles Triangle ");
                IO.println("perimeter:" + perimeter);
                IO.println("area:" + area);


            } else if (side1 != side2 && side2 != base && base != side1) {
                IO.println("Isosceles Triangle ");
                IO.println("perimeter:" + perimeter);
                IO.println("area:" + area);


            }


        }
    }
}