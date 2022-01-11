package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println("enter your gender");
        String gender = scan.next();
        scan.nextLine();


        System.out.println("enter your fullname");
        String fullname = scan.nextLine();
        System.out.println("enter your phone number");
        long phonenumber= scan.nextLong();
        scan.nextLine();
        System.out.println("enter your zipcode");
        int zipcode= scan.nextInt();
        scan.nextLine();

        System.out.println("enter your school name");
        String schoolname= scan.nextLine();
        System.out.println("enter your city name");
        String cityname=scan.nextLine();
        System.out.println("enter your state name");
        String statename=scan.next();
        scan.nextLine();
        System.out.println("enter your building number");
        int buildingnumber= scan.nextInt();
        scan.nextLine();
        System.out.println("enter your Street name");
        String streetname= scan.nextLine();

        scan.close();


        System.out.println("your age= " + age +"your gender = " + gender
        + " your full name = " + fullname + "your phone number = " + phonenumber
        + "your zip code = " +zipcode+ "your scholl name= "+ schoolname + "your city name = " + cityname +
                        "your city name = " + cityname+ "your city name = " + cityname
                +"your state name = " + statename +"your building name = "+ buildingnumber +
                "your street name = " + streetname

                );


    }
}
