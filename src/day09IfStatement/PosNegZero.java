package day09IfStatement;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;

        if (n > 0) {
            System.out.println( n + " is positive");
        } else if (n < 0) {
            System.out.println(n + "negative");
        } else {
            System.out.println( n + "zero");
        }


    }
}
