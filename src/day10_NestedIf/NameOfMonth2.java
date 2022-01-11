package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int num = 5;
        String result = (num == 1)? "january" : (num ==2)? "febuary" : (num == 3)? "march"
                :(num ==4)? "april" :(num==5)? "may" :(num==6)? "jun"
                :(num==7)? "july" : (num==8)? "agust" : ( num == 9)? "agust"
                : ( num == 10)? "ocotober":(num == 11)?
                "novamber" : "december";
        System.out.println(result);





    }




}
