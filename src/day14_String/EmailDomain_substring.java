package day14_String;

public class EmailDomain_substring {
    public static void main(String[] args) {

        String email= "cydeo.school@gmail.com";


        int beginningIndex=email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");
       String domain= email.substring(beginningIndex,endingIndex);

        System.out.println(domain);
        System.out.println("=========================");
String str1 = "java is fun, java is cool";
String s1= str1.substring(0,10 +1);
        System.out.println(s1);
int beg = str1.lastIndexOf(" j") +1;
int end = str1.lastIndexOf(",");
String str2=str1.substring(beg);
        System.out.println(str2);







    }
}
