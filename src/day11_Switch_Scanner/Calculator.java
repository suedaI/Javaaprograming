package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 200.0;
        double n2 = 10.0;
        char operator = '%';
        boolean valid = operator == '+'|| operator == '-'|| operator == '/';
        if (valid){ //operator
            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '_':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);

            }
            } else{
                System.err.println("invalid result");
            }
        }










    }
