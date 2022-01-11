package day33_Statics;

public class Iphone {
    public static String brand = "Apple";
    public String modal;
    public double price;
    public static String OS = "IOS";
    public String color;
    public String size;
    public static String madeIn = "china";
    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;
    public static boolean hasCamera = true;
    public static boolean hasFaceTime = true;
public void method1(){
    System.out.println(modal+" : "+price);
    System.out.println(OS);
}
//public static void printModalAndPrice(){
  //  System.out.println(modal+" : "+price);static methods does not accept instances

    public static void printModalAndPrice(){
        System.out.println(OS);
    }


}
