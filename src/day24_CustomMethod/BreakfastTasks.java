package day24_CustomMethod;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("cydeo", "school");
        System.out.println("==================");
        domain("sueda@gmail.com");
        System.out.println("==============================");
        String emails[] ={"josh@gmail.com" , "jim@hotmail.com" ,"sueda@gmail.com"};
        for (String email : emails) {
            domain(email);

        }
        System.out.println("===================================");
nameOfMonth(6);

    }

    public static void initials(String firstName ,String lastName){

        String initial=firstName.charAt(0)+ "."+lastName.charAt(0);
        initial=initial.toUpperCase(Locale.ROOT);
        System.out.println("intial "+initial);

    }

public  static void domain (String email){

        String domain=email.substring(email.indexOf("@"+1) ,email.lastIndexOf("."));
    System.out.println(domain);
}


public static void nameOfMonth (int number){
        String name="";
        if (number >=1&& number<+12){
            name=(number==1)?"jan": (number==2)?"feb":(number==3)?"march":(number==4)?"april":(number==5)?"may":(number==6)?"jun"
                    :(number==7)?"july":(number==8)?"agst":(number==9)?"sep":(number==10)?"oct":(number==11)?"nov.":"dec";
        }else{
            name="invalid number";
        }
    System.out.println(name);


}

public static void nameOfDay(int number){

}

public static void dayInMonth(int number){

}

}
