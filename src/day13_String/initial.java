package day13_String;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your first name;");
        String firstName= scan.next();
        System.out.println("enter your last name;");
        String lastname = scan.next();

       char f = firstName.charAt(0);
        char l  = lastname.charAt(0);

        String initial = f + "." + l ;
        System.out.println("initial = " + initial);

scan.close();
    }
}
