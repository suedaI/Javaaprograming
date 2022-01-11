package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }



//returns the unique elements of the array a new array
    public static int [] uniqueElements(int[] array){
        int[] result= {};//new int[0]
        for (int each : array){
            if (ArraysUtility.frequencyOfElement(array,each) ==1){ //if the frequency is one,the element is unique
                result=ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }









}
