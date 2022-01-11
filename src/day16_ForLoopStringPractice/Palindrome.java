package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        /*
        java= avaj == false (not palindrome)
        anna= anna== true (palindrome)
         */
        String word= "level";
        String reversed ="";
        for (int i = word.length()-1; i >=0 ; i--) {
           reversed+= word.charAt(i);
        }
        boolean isPalindrome= word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);






    }
}
