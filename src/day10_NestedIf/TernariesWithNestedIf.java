package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 85;

        String result = (s >= 0 && s <= 100) ? (s >= 60) ? "passed" : "faild" : "invaild";

        System.out.println(result);













    }
}