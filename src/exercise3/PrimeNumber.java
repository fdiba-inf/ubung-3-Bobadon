package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int div = 2;
        boolean prime = true;
        while (div < num){
          if (num % div == 0)
          prime = false;
          div++;
        }
        System.out.println("Prime number: " + prime);
    }

}
