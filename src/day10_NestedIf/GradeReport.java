package day10_NestedIf;

import javax.swing.*;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90 ~ 100: excellent
        80 ~ 89: great
        70 ~ 79: good
        60 ~ 69: passed
        0 ~ 59: faild
         */
        int score = 95;

        String result = ""; // temporary

        if (score >= 0 && score <= 100) {


            if (score >= 90 && score <= 100) {
                result = ("excellent");
            } else if (score >= 80 && score <= 89) {
               result = ("great");
            } else if (score >= 70 && score <= 79) {
                result = ("good");
            } else if (score >= 60 && score <= 69) {
              result = ("passed");
            } else {
                result = ("faild");
            }
        } else //if the score is not valid
            result = ("invalid score");


        System.out.println( result);



    }
}



