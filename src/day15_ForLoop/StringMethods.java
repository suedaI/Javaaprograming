package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";
        boolean r= str.isEmpty();
        System.out.println(r);

        str.isBlank();
        boolean r1 = str.isBlank();
        System.out.println(r1);
        System.out.println("-----------------------------");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("================================");

        String sentence="My favorite programming language is Java";

        boolean hasCSharp=sentence.contains("C#");
       boolean hasJava=sentence.contains("java");
       boolean hasjava2=sentence.contains("java");
        boolean hasjava3= sentence.toLowerCase().contains("java");



       System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasjava2);
        System.out.println(hasjava3);
        System.out.println("================");
String input1= "I love Java";
String input2="Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains("java"));//true
        System.out.println(input1.toUpperCase().contains("java"));
        System.out.println(input1.toLowerCase().contains("JAVA"));

        System.out.println("==========================");
String a="wooden spoon";
boolean x =a.startsWith("woo");
        System.out.println(x);
boolean y= a.endsWith("oon");
        System.out.println(y);
        boolean z=a.toLowerCase().startsWith("wooden");
        System.out.println(z);







    }




}
