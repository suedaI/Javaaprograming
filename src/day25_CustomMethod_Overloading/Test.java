package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String str="Java programing language";
        StringUtility.printEachChar(str);
        System.out.println("====================");
        String s1="wooden spoon";
        String s2=StringUtility.reverse(s1);
        System.out.println(s2);
        System.out.println("==================");
        String s3="civic";
      boolean palindrome= StringUtility.isPalindrome(s3);
        System.out.println("palindrome = " + palindrome);
        System.out.println("==================");
        String[] names={"anna","java","python","racecaar,","mom"};
        int count=0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("================");

        String s4="aaaaaaabbbbbcccddddd";
        String nonDup=StringUtility.removeDuplicates(s4);
        System.out.println(nonDup);

    }


}
