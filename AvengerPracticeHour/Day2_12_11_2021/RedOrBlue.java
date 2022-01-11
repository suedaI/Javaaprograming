package Day2_12_11_2021;

public class RedOrBlue {
    public static void main(String[] args) {


        String num1="redxx";
        String num2="xxred";
        String num3="blueTimes";
        String result ="";

       if (num1.startsWith("red"))
            result="red";

        else if (num2.startsWith("blue"))
        result="blue";
        else
            result="\"\"";
        System.out.println(result);

    }
}
