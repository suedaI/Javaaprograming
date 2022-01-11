package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "aabbaacc";
        String result="";
        for (int i = 0; i < str.length() ; i++) {
             String  ch =""+ str.charAt(i);//represents each Character of str

            if (!result.contains(ch) ) {//if the character is not contained result.
                result += ch;
            }
        }


        System.out.println(result);

    }
}
