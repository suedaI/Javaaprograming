package day17_While_doWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 'A'; i <='Z' ; i++) {
            System.out.println(i + " ");
            if (i == 'F') {
                break; // exits the loop
            }


        }
        System.out.println();
        System.out.println("====================");
        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.println("enter a number:");
            int num= scan.nextInt();
            if (num < 0){
                break;





            }
        }




    }
}
