package day09IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b= 15;
        int c=20;
        /* posibility1: a could be median num
        posibility2:b could be
        posibility3:c could be
         */

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian  = (b>a && b<c) || (b >c && b < a);
        //boolean cIsMedian = (c>a && c<b) || (c>b && c<a );
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        if (aIsMedian){
            System.out.println(a + " is median number ");
        }
        if (bIsMedian){
            System.out.println(b+ " is median number");
        }
        if (cIsMedian){
            System.out.println(c+ " is the median number");
        }




    }
}

