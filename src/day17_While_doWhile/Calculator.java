package day17_While_doWhile;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1= scan.nextInt();
        System.out.println("enter your second number:");
        int num2= scan.nextInt();
        System.out.println("enter a math oterator:");
        char ch =scan.next().charAt(0);//
        while ( !(ch == '+' || ch == '-') ){ //false olursa
            System.out.println("invalid operator,pls re-enter");
            ch= scan.next().charAt(0);
        }
        System.out.println((ch == '+') ? num1 + num2  : num1 - num2);


    }
}
