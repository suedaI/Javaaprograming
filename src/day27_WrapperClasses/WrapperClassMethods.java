package day27_WrapperClasses;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.concurrent.Callable;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";
        int num=Integer.parseInt(str); //int
        System.out.println(num+1); //124
        System.out.println(str+1);//1231

        String str2="10.5";
        double num2=Double.parseDouble(str2);//double

        System.out.println(num2+1);//11.5

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

long max2=Long.MAX_VALUE;
long min2=Long.MIN_VALUE;
        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        String s1="true";
     boolean r1  = Boolean.parseBoolean(s1);

        System.out.println("============================" );
String s2="123";
Integer x=Integer.valueOf(s2); //integer
int y=Integer.valueOf(s2);


        System.out.println(x);

        System.out.println(y);

String s3="1.5";
double z=Double.valueOf(s3);//Double
        System.out.println(z);
        System.out.println("=============================");

        //isDigit()
        char ch1='0';
char ch2='!';
char ch3='A';
char ch4='a';

       boolean r2= Character.isDigit(ch1);
        System.out.println(r2);
        boolean r3=Character.isLetter(ch1);
        System.out.println(r3);
        //special char
boolean r4=Character.isLetterOrDigit(ch2);
        System.out.println(r4);

        //uppercase
      boolean r5=Character.isUpperCase(ch3);
        System.out.println(ch3);
        //lowercase
        boolean r6=Character.isLowerCase(ch4);
        System.out.println(ch4);
        System.out.println("-----------------------");
        String s="abc1ju2lk5h6j8";
        int sum=0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum +=Integer.parseInt(""+each);
            }
            System.out.println("sum = " + sum);


        }







    }
}
