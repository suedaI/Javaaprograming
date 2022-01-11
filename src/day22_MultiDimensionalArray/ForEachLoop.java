package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int [][]arrd2D= {{1,2,3} , {4,5,6,7} , {8,9,10,11,12}};
        for ( int[] each1DArray:arrd2D){
          for (int eachElement:each1DArray){
              System.out.println(eachElement);
          }
        }











    }
}
