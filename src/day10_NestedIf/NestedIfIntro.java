package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;


        if (score >= 60) {

            System.out.println("Passed");
        }
        System.out.println("Failed");


        System.out.println("------------------");


        int age = 19;
        boolean hasId = true;

        if (hasId) { // if person has ID

            if (age >= 21) { // if person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is less than 21
                System.out.println(" not eligible to buy alchol");
            }

        } else { //if the person does not have an a ID
            System.out.println(" you must have ID");
        }

        System.out.println("===========================");

        int number = 7;

        if (number >= 1 && number <= 7) { //if the number is a valid number (1~7)

        } else // if the number is not valid
            System.out.println("invalid number");
        if (number == 1) {
            System.out.println("monday");
        } else if (number == 2) {
            System.out.println("tuesday");
        } else if (number == 4) {
            System.out.println("wendesday");
        } else if (number == 5)
            System.out.println("saturday");
        else if (number == 7) {

        }else
            System.out.println("sunday");







    }
}