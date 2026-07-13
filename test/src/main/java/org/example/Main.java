package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String name = "x-axis";
        Integer x = 10;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i + "name:" + name + " " + x);
            } else if (i % 3 == 0) {
                System.out.println(i + "multiple by 3");
            }
            i++;
        }

    }
}

