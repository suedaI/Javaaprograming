package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String [] students={"elif","sinem","gunay","cihad","david","muhtar","sueda","daniel"};

        String []earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("====================================");
char [] ch1={'A','B','C','D','E','G','I'};
char[] ch2=Arrays.copyOfRange(ch1,2,5+1);
        System.out.println(Arrays.toString(ch2));
        System.out.println("========================");

int [] score={10,20,30,40,50,60,70,80,90,100};
int []score2= Arrays.copyOfRange(score,3,8);
        System.out.println(Arrays.toString(score2));





























    }
}
