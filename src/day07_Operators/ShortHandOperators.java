package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment; =
        int number = 100;
        System.out.println("number =" + number);//100
        number = 200;
        System.out.println("number = " + number); //200
        String world = "Java Programming";
        System.out.println("world" + world);// Java Programming
        world = "Wooden Spoon";
        System.out.println("world = " + world);// Wooden Spoon
         //world = 123;  >...you can not
        System.out.println("--------------------------");
        //Addition Assignment:
        int x = 100;
        System.out.println("x= " + x);
        System.out.println(x + 200); //300
        //x = x+200;
        x += 200;
        System.out.println("x = " + x);




    }
}
