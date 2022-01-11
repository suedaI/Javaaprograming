package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password="Cydeo1990@";
        boolean r1=password.length() >= 8 && !password.contains(" ");
        boolean r2=false; //has upper case
        boolean r3=false;//has lover case
        boolean r4=false;//has special char
        boolean r5=false;//has digit

        char[]chars = password.toCharArray();

        for (char each:chars){

            if (Character.isUpperCase(each)){
                r2= true;
            }else if (Character.isLowerCase(each)){
                r3=true;

            }else if (Character.isDigit(each)){
                r4=true;
            }else{                 //special char
                r5=true;
            }
            /*
if (r2 && r3 && r4 && r5){
    break;
}
*/


        }

        boolean isStrongPassword=r1& r2 & r3 & r4 & r5;
        System.out.println("isStrongPassword = " + isStrongPassword);

    }
}
