package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);

        System.out.println("----------------------");

int []scores={95,100,55,65,85,78};
Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("min Score "+ scores[0]);
        System.out.println("max score"+ scores[scores.length-1]);

        String [] names={"zuhal","anna","ahmet","gunay","sueda"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
       String [] word={"anna","ANNA"};
       Arrays.sort(word);
        System.out.println(Arrays.toString(word));

        System.out.println("========================");
int []arr1 ={1,2,3};
int []arr2={1,3,2};
 boolean r1=Arrays.equals(arr1,arr2);

        System.out.println(r1);

Arrays.sort(arr1);
Arrays.sort(arr2);
boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);
        System.out.println("============================");

    char [] ch1={'a','b','c'}  ;
    char[] ch2={'b','c','a'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
boolean r3=Arrays.equals(ch1,ch2);
        System.out.println(r3);








    }
}
