package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String world = "Cydeo";
        char thirdChar = world.charAt(3);
        System.out.println("thirdchar = " + thirdChar);

        char tenthChar = world.charAt(1);
        System.out.println("tenthChar = " + tenthChar);
        System.out.println("==============================");
String s1 = "batch 25 is the best batch.";
int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

char lastChar = s1.charAt(s1.length()-1);

        System.out.println("lastChar = "+ lastChar);
        System.out.println("============================");
        String str = "wooden spoon";
        str=str.toUpperCase(Locale.ROOT);//"WOODEN SPOON"
        System.out.println(str);













    }
}
