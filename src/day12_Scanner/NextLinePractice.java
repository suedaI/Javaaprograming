package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your age");
        int age =input.nextInt();
        input.nextLine();//enter
        System.out.println("enter your full name");
        String fullName = input.nextLine();
        System.out.println("enter your GPA");
double gpa = input.nextDouble();
input.nextLine();
        System.out.println("enter your school name ");
        String scoolName = input.nextLine();
        System.out.println("age = " + age);
        System.out.println("full name= " + fullName);
        System.out.println("school name = "+ scoolName);

        input.close();


    }

}
