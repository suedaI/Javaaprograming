package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer>numbers;



    public Circle(double radius){
        this.radius=radius;
    }


    static {
        pi=3.14;
        name="circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }




}
