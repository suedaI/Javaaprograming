package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
       String firstname="cyDEo",
               lastname="SCHOOL";
    // String result1 =  firstname.substring(0,1).toUpperCase() +firstname.substring(1).toLowerCase();
        firstname=(""+firstname.charAt(0)).toUpperCase()+firstname.substring(1).toLowerCase();
        System.out.println(firstname);

        lastname= lastname.substring(0,1)+ lastname.substring(1).toLowerCase();
        System.out.println(lastname);
        String fullname= firstname+" "+  lastname;

        System.out.println( "fulname = "  +   fullname);


    }
}
