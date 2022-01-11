package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesInto {

    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even"); //string
        } else {
            System.out.println("odd");
        }
        System.out.println("-----------");
        String result1 = (n % 2 == 0) ? "even " : "odd";

        System.out.println(result1);
        System.out.println("=========================");

        int age = 23;
        /*
        if (age >= 21) {
            System.out.println("eligible");

        } else {
            System.out.println("not eligible");
        }

 */
      String result =  (age >=21) ? "eligble" : "not eligble";

        System.out.println(result);
        System.out.println("------------------------");

        int num = 100;
        if (num >0){
            System.out.println("positive");
        } else if(num <0){
            System.out.println("negatif");
        }else{
            System.out.println("zero");
        }



        String result3 = (num >0)? "positive" :(num<0)? "negatif" : "zero";
        System.out.println(result3);







    }
}
