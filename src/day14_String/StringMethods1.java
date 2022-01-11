package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {


        String str1 = "  batch   25     ";

        str1 = str1.trim(); // "batch 25"

        System.out.println(str1);
        String str2= "Cydeo School";

int n1=str2.indexOf("h");//8
        System.out.println("n1 =" + n1);
        int n2= str2.indexOf("ool");
        System.out.println("n2= " + n2);
        String str3 = "java programming language";
        int n3= str3.indexOf("amm");//3
        System.out.println("n3= " + n3);

        System.out.println("==========================");
String s="Java Nova Cava Wawa orange";

int firstA =s.indexOf("a");
int lastA= s.lastIndexOf("a");
int secondA= s.indexOf("a ");
int thirdA=s.indexOf("a C");
//int fourtA = s.indexOf("ava W");
int fourtA= s.lastIndexOf("av");
int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA =" + firstA);
        System.out.println("lastA = " + lastA);


    }





}
