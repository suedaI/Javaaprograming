package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName = scan.nextLine();
        System.out.println("enter your building number");
      String building = scan.next();
      scan.nextLine();
        System.out.println("enter your street name");
        String streetname = scan.nextLine();
        System.out.println("enter your city name");
        String cityname = scan.nextLine();
        System.out.println("enter your state name");
        String statename = scan.next();
        System.out.println("enter your zip code");
        String zipcode = scan.next();
        scan.nextLine();
        System.out.println("enter your county name ");
String county = scan.nextLine();



        System.out.println("fullName = " + fullName);
        System.out.println("bullding name = " + building);
        System.out.println("street name = " + streetname);
        System.out.println("city name = "+ cityname);
        System.out.println("state name = " + statename);
        System.out.println("state name = " + statename);
        System.out.println("zip code = " + zipcode);
        System.out.println("country name = "+ county);



    }
}
