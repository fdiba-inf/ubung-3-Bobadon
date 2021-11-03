package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value;
        char type;
        do{
          value = input.nextDouble();
          type = input.next().charAt(0);

          if (type == 'r') {
            double convert = value/Math.PI * 180;
            System.out.println("Angle: " + convert + "d");
          } else if (type == 'd') {
            double convert = value * Math.PI / 180;
            System.out.println("Angle: " + convert + "r");
          }
        } while (type == 'r' || type == 'd');
    }

}
