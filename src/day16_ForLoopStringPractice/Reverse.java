package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result = "";//contain the reversed version of str
        for (int i = str.length() - 1; i >= 0; i--) { //i:is index numbers of str

            result += str.charAt(i);
        }

        System.out.println(result);









    }
}
