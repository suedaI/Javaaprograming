package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        System.out.println( true == !false); //true
        System.out.println( !true != false);//false
        System.out.println( !false == true); //true
        System.out.println(!!false);//false
        System.out.println(!!!true); //false

        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a;// if score is A, but score is greater than 80
        //boolean b = score >= 80 && score <= 89; //other saying
         boolean c = score >= 70 && score <= 79;
        //boolean c = !a && !b && score >= 70;
        boolean d = score >= 60 && score <= 59;
        //boolean f = !a && !b && !c && !d ;
         boolean f = score>= 0 && score <= 59;

         if (a){//if the student made A
         System.out.println("Excellent");}
         if (b){
        System.out.println("Great");}
         if (c){
        System.out.println("Good");}

         if (d){
        System.out.println("Passed");}
         if (f){
        System.out.println("Faild");}








    }
}
