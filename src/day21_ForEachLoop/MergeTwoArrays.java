package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String [] group1={"ali","layan","aysenur",};
        String [] group2={"maria","aygun","duygu","suat","valeria"};

        String []students= new String[group1.length + group2.length];
        int i=0;
        for (String each : group1) {
           students[i++] =each;
        }
        for (String each : group2) {
            students[i++] =each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("====================" );

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','U'};
        char[] chars=new char[ch1.length+ch2.length];
        int j=0;
        for (char ch : ch1) {
            chars[j]=ch;
            j++;
        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }
}
