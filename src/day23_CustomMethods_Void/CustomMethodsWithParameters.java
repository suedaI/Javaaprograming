package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        // oddOrEven();//the method demains aditional info to comlate its task
        oddOrEven(3);
        ageOfPerson(1992);
        printNumbers(1 ,4);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void ageOfPerson(int birthyear) {
        int age = 2021 - birthyear;
        System.out.println("your age is: " + age);
    }


    public static void printNumbers(int x,int y){
        for (int i = x; i < y; i++) {
            System.out.println(i);
        }
    }

}