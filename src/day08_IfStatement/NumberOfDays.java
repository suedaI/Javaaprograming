package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 5; // 1 ~ 12
        boolean has28Days = number == 2; //for the month that has 28.
        boolean has30Days = number == 4 || number == 6 || number ==9 || number == 11;
        boolean has31Days =  !has28Days && !has30Days; //if the month does not have 28 and 30

        if (has28Days){ //if the month has 28 days
            System.out.println("28 days");
        }
if (has30Days){  //if the month has 30 days
    System.out.println("30 days");
}

if (has31Days) { // if the month has 32 days
    System.out.println("31 days");
}







    }
}
