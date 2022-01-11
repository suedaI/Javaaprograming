package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
       ArraysUtility.printEachElement(arr1);
        System.out.println("+++++++++++++++++++++++++");
        double [] arr2={1.5,2.5,6.7};
        ArraysUtility.printEachElement(arr2);
        System.out.println("=============================");
        char []arr3={'a','b','v'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("===================");
        String [] arr4={"hello", "word","hello cydeo"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("======================");
int [] arr5={1,2,7,0,9};
int max1=ArraysUtility.max(arr5);
        System.out.println(max1);
        System.out.println("++++++++++++++++++++++");
        double[] arr6={2.4,5.6,7.9};
        double max2=ArraysUtility.max(arr6);
        System.out.println("max2 = " + max2);


        }


}
