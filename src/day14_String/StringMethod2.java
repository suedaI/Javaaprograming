package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str= "java is fun,I love learning java";
        String  str2=str.replace("java" , "python");//"python is fun I love learning python


        System.out.println(str2);

String email="johnSmith@yahoo.com";
String email2=email.replace("yahoo" , "gmail");

        System.out.println("email=" + email2);

String sentence = "java java python python C# C# C++ C++ python python python python ";

String sentence2 = sentence.replace("python" ,"");

        System.out.println(sentence2);
        System.out.println("------------------------------------");
 String s = "dog dog dog dog dog dog";
 String s2= s.replace("dog", "cat");
        System.out.println(s2);

        String s3 = "C# is fun, C# is cool";
       String s4= s3.replace(" C#", "Java");

        System.out.println(s4);
String s6 = "Java";
String s7 = s6.replace("a","e");
        System.out.println(s7);

String result= "Java Java Java";
String result1= result.replaceFirst("java","Python");



        System.out.println(result1);

        String r = "C# is fun , c# is cool";
        String r1 = r.replaceFirst("C#", "java");

        System.out.println(r1);

String result12 = "Java";
String result13 = result12.replaceFirst("va","vo");
        System.out.println(result13);




    }
}
