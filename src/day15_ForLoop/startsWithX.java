package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {


    public static void main(String[] args) {
        System.out.println("enter a word:");
        String word= new Scanner(System.in).next();//xcode
        if (word.charAt(0)== 'x'){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);













    }
}
