package day08_IfStatement;

public class SingeIfStatementIntro {
    public static void main(String[] args) {
        int number = 100;
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;// not even number
        if (evenNumber) { // even number
            System.out.println(number + " is even number");
        }
        if (oddNumber) {
            System.out.println(number + " is odd number");
        }
        System.out.println("---------------------");
        int n = 200;
        //positive
        if (n > 0) {
            System.out.println(n + " is positive");
        }

        //negative
        if (n < 0) { //if n is less than zero,then it's negative
            System.out.println(n + " is negative");
        }

//zero
        if (n == 0) { //if n is less than zero,then it's negative
            System.out.println(n+ " is negative");
        }
    }
}
