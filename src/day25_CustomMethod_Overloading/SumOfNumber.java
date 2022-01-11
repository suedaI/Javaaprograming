package day25_CustomMethod_Overloading;

public class SumOfNumber {
    public static void main(String[] args) {
       int sum= sumOf2Numbers(2,6);
        System.out.println(sum);
        System.out.println("===============");
       int sum2= sumOf3Numbers(3,5,9);
        System.out.println(sum2);
        System.out.println("==================");
        int sum3=sumOf4Numbers(7,8,9,9);
        System.out.println(sum3);

    }
    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;

    }

    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public static int sumOf4Numbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

}