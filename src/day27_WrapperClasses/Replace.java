package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        arr=replace(arr,2,39);
        System.out.println(Arrays.toString(arr));
    }
//replace the elements of array at given index with the new element
    public static int[] replace(int[] array,int index,int newElement ){
        if (index<0 || index> array.length-1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;


    }
    //replace the elements of array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement ){
        if (index<0 || index> array.length-1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;


    }
//replace the elements of array at given index with the new element
    public static char[] replace(char[] array,int index,int newElement ){
        if (index<0 || index> array.length-1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        array[index]= (char) newElement;
        return array;


    }

//replace the elements of array at given index with the new element
    public static String[] replace(String[] array,int index,String newElement ){
        if (index<0 || index> array.length-1){
            System.err.println("invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;


    }


}
