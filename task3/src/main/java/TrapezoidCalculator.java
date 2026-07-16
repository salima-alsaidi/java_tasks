import java.util.ArrayList;

public class TrapezoidCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> sides = new ArrayList<Integer>();
        String input1 = IO.readln("enter base1");
        int base1 = new Integer(input1);
        sides.add(base1);
        String input2 = IO.readln("enter base2");
        int base2 = new Integer(input2);
        sides.add(base2);
        String input3 = IO.readln("enter leg1");
        int leg1 = new Integer(input3);
        sides.add(leg1);
        String input4 = IO.readln("enter leg2");
        int leg2 = new Integer(input4);
        sides.add(leg2);
        String input5 = IO.readln("enter hight");
        int hight = new Integer(input5);
        sides.add(hight);
        double perimeter=0;
        double area=0;

            for (int i = 0; i < sides.size(); i++) {
                if (sides.get(i) != 0) {
                     area = 0.5 * (base1 + base2) * hight;
                    IO.println(area);
                     perimeter = base1 + base2 + leg1 + leg2;
                    IO.println(perimeter);
                } else {
                    IO.println("some of sides in invalid");
                }
                 if(perimeter<30){
                     IO.println("Small Trapezoid");
                 }else if(perimeter>30 && perimeter<60){
                     IO.println("Medium Trapezoid ");
                 }else if(perimeter>60){
                     IO.println("Large Trapezoid");
                 }
            }
    }
}
