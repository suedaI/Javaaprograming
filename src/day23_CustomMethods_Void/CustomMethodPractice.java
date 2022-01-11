package day23_CustomMethods_Void;


public class CustomMethodPractice {

    public static void main(String[] args) {
        helloWord5Times();
        System.out.println("____________");
        helloCydeo5Times();
        System.out.println("____________");
        evenNumbers();
        System.out.println("____________");
    }
    public static void helloWord5Times(){
        for (int i = 0;  i< 5; i++) {
            System.out.println("hello word");
        }


    }


    public static void helloCydeo5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello cydeo ");
        }
    }


public static void evenNumbers (){
    for (int i = 1; i <=10 ; i+=2) {
        System.out.println(i);
    }
}



}
