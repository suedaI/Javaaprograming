package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int [] element={10,20,50,70};
        System.out.println(Arrays.toString(element));

        System.out.println("====================");
int[] scores = new int[5];
scores[1]=85;
scores[scores.length-1] =95;
scores[3]=75;
scores[0]=65;
scores[2]=55;
        System.out.println(Arrays.toString(scores));

        System.out.println("=====================");

String[] m ={"january","february","march","april","may","june","july",
"agust","september","october","november","december"};
    /*
        System.out.println( m [0]);
        System.out.println(m [3]);
        System.out.println(m[8]);
        System.out.println(m[11]);
        */

        for (int i = 0; i <12; i++) { //i index num. 0-12
            System.out.println(m[i ] );

        }

        System.out.println("=============================");
        for (int i = m.length-1; i >=0 ; i--) { //array start last index
            System.out.println(m[i]);
        }



    }
}
