package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 10;
        String result = "";
        if (number >= 1 && number <= 18) {

            switch (number) {
                case 6:
                case 7:
                case 8:
                    result = "middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "high school";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "collage";
                    break;
                case 17:
                case 18:
                    result = "grad school";
                default: //1~5
                    result = "elementary school";


            }
            System.out.println(result);


        } else {
            result = "invalid grade";
        }


    }
}
