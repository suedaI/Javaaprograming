package day19_LoopsPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a number:");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number:");
            }
            System.out.println("would like to enter a other number:");
            String a = scan.next();
if (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no")))
    System.out.println("invalid entry");
System.exit(0);
            if (a.equalsIgnoreCase("no")) {
                
                System.out.println("thank you.");
            }


        }

    }
}
