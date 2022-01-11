package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char ch = 'B';



        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("pased");
                break;
            case 'F':
                System.out.println("faild");
            default:
                System.out.println("invalid ");
        }


    }
}
