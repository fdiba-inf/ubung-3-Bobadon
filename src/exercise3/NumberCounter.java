package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int pos = 0;
        int neg = 0;
        double sum = 0;
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
          if (num > 0) {
            pos++;
          } else {
            neg++;
          }
          sum = sum + num;
          System.out.println("Enter a number: ");
          num = input.nextInt();
        }
        double ave = sum / (pos + neg);
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ave);
    }

}
