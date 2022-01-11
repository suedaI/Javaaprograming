package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that s capable enough to contain 5 name

        String [] myGroup =new String[5];
       // System.out.println(myGroup);//hascode its false


        myGroup[0]="sueda";
        myGroup[1]="gokhan";
        myGroup[2]="mina";
        myGroup[3]="muhtar";
        myGroup[4]="mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("========================");

String [] days = {"monday","tuesday","wednesdays","thursday","friday","saturday","sunday"};

        System.out.println(Arrays.toString(days));

int num = 1 ;

        if(num < 1 || num>7){
            System.err.println("invalid number");
            System.exit(0);
        }

        System.out.println(days[ num ]);




    }
}
