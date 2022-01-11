package day12_Scanner;

//import java.util.Scanner.*; //wild import everything from the package
import java.util.Scanner; //regular import:imports one class
public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /* new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        */
        scan = new Scanner(System.in);
        System.out.println("enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result = "";
        if (num >= 1 && num <= 7) {
            switch (num) {
                case 1:
                    result = "monday";
                    break;
                case 2:
                    result = "tuesday";
                    break;
                case 3:
                    result = "wednesday";
                    break;
                case 4:
                    result = "thursday";
                    break;
                case 5:
                    result = "friday";
                    break;
                case 6:
                    result = "saturday";
                    break;
                default:
                    result = "sunday";
            }


        } else {
            result = "invalid number";
            System.out.println(result);


        }
    }
}
