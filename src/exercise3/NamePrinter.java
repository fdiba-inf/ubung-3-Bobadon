package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (int index = 0; index < name.length(); index++) {
          char sym = name.charAt(index);
          System.out.println("* " + sym + " *");
        }
    }

}
