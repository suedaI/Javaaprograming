package day12_Scanner;

import java.util.Scanner;

public class Scanerpractice3_Nextline {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); //enter

        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your programming language");
String programming = input.nextLine();
        System.out.println("enter your age:");
        int age = input.nextInt();//24enter

        input.nextLine();//capture the entre key that user pressed for nextInt
        System.out.println("enter your school name");
        String schoolName = input.nextLine(); //enter


        System.out.println("full name= " +fullName);
        System.out.println("programing = " + programming);
        System.out.println("age = " +age );
        System.out.println("scholl name = " + schoolName);

input.close();



    }


}
