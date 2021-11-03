package exercise3;

import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int counter = 0;
      for (int num = 100; num <= 1000; num++) {
        if (num % 5 == 0 && num % 6 == 0) {
          counter++;
          if ( counter % 10 == 0) {
            System.out.println(num);
          }else {
            System.out.println(num + " ");
          }
        }
      }
    }

}
