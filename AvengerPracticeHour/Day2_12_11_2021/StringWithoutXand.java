package Day2_12_11_2021;

public class StringWithoutXand {
    public static void main(String[] args) {

        String input1 = "xHix";

        String result = "";

        if (input1.charAt(0) == 'x' && input1.charAt(input1.length() - 1) == 'x') ;
        for (int i = 1; i < input1.length() - 1; i++) {
            result += input1.charAt(i);
        }





    }
}
