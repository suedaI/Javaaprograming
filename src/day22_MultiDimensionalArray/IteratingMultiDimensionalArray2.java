package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][]arrd2D= {{1,2,3} , {4,5,6,7} , {8,9,10,11,12}};
        for (int i = arrd2D.length - 1; i >= 0; i--) { //i:index number of 1d ,starting from last index to 0
            for (int j = 0; j < arrd2D[i].length; j++) {//j:index num. of elements starting from 0 to last index
                System.out.print(arrd2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===============================");

        for (int i =0; i< arrd2D.length; i++){
            for (int j = arrd2D[i].length-1;j>=0;j--){
                System.out.print(arrd2D[i][j] + " ");
            }
            System.out.println();
        }


























    }
}
