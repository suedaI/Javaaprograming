package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];

        alphabets[0] = 'Z';

        System.out.println(Arrays.toString(alphabets));//print the whole array
        System.out.println(alphabets[0]);//printing the element


        System.out.println("=============");
        char ch = 'Z';
        for (char i = 0,j='Z'; i <alphabets.length ; i++,j--) {
            alphabets[i]=j;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}
