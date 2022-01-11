package day26_CustomMethodPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,11,1,11,1,2,3,4,5,6,6,6,7,7,8,9,0,0,1,1,1};

       int n= frequencyOfElement(arr,1);
        System.out.println(n);


    }



//returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]array, int element){
        int count=0;
        for (int each : array) {
            if (each==element){
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array-
    public static int frequencyOfElement(double[]array, double element){
        int count=0;
        for (double each : array) {
            if (each==element){
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char []array, char element){
        int count=0;
        for (char each : array) {
            if (each==element){
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[]array, String element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;

            }
        }
        return count;
    }


}


