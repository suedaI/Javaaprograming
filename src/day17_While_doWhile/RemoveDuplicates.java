package day17_While_doWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="AABBCC";
        String result="";//"ABC"
        for (int i = 0; i < str.length(); i++) {
            String ch="" + str.charAt(i);//"A" "B" "C"
            if (result.contains(ch)){
                continue;//skips
            }
            result += ch;
        }
        System.out.println(result);
    }
}
