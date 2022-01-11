package day14_String;

import com.sun.security.jgss.GSSUtil;

public class Substring3 {
    public static void main(String[] args) {
        //substring(beginning index,ending index)
        String world ="Cydeo School ";
       String brand= world.substring(0, 4+1);

        System.out.println(brand);
String str1=world.substring(6);
        System.out.println(str1);

String world2="sueda ruby language";
String s1= world2.substring(0, world2.indexOf(" "))   ; //java
String s2=   world2.substring(world2.indexOf(" ")+1, world2.lastIndexOf(" "))  ;//programing
String s3=  world2.substring(world2.lastIndexOf(" ")+1  )    ;//language


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);





    }






}
