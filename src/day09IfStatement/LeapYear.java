package day09IfStatement;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = year% 4 == 0;
        if (leapYear){
            System.out.println(" year " + year);

        }else{
            System.out.println(" year" + year + " is Not a leap year");
        }





    }
}
