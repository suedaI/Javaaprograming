package day09IfStatement;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 5;//1~7
        String day;

        if (n == 1) {
            //System.out.println("monday");
            day = "monday";
        } else if (n == 2) {
            System.out.println("tuesday");

        } else if (n == 3) {
            System.out.println("wednesday");

        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("friday");
        } else if (n == 6) {
            System.out.println("saturday");

        } else if (n == 7) {
            System.out.println("sunday");
        } else
            System.out.println("invalid");


    }
}
