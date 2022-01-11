package day09IfStatement;

public class MinNumber {
    public static void main(String[] args) {
      int n1 = 100;
      int n2 = 200;
      boolean n1IsMin= n1< n2;
      boolean n2IsMin= n2<n2;
      boolean equal = n1 == n2;

      if (n1IsMin) {
          System.out.println(n1 + " is the minimum number"); //if n1 is min. number

      }
        if (n2IsMin){
            System.out.println(n2 +" is the minumum number" );

        }
        if (equal){
            System.out.println("equal");
        }



    }
}
