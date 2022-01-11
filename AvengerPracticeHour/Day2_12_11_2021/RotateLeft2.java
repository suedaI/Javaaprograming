package Day2_12_11_2021;

import java.util.Scanner;

public class RotateLeft2 {
    public static void main(String[] args) {

        String str1="hello";
        String str2=str1.substring(2)+str1.substring(0,2);

        System.out.println(str2);
        System.out.println("====================");

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word");
        String word= scan.next();

String word2="";
        for (int i = 2; i <word.length() ; i++) {
            word2+=word.charAt(i);
        }
        for (int i = 0; i < 2; i++) {
            word2+=word.charAt(i);
        }

scan.close();




    }
}
