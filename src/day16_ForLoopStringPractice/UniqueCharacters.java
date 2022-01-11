package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcc";
        String result="";


        for (int i = 0; i < str.length() ; i++) { //i index num. of string staring from 0
            char ch=str.charAt(i);
            if (str.indexOf(ch) ==str.lastIndexOf(ch)) { //first and laast index number of character are same,then the crakter uniq
                result += ch;
            }

        }

        System.out.println(result);






    }
}
