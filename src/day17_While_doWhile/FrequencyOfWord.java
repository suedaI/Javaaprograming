package day17_While_doWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJavaJava";
        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) { //i:1,2,3,..7 -3 cunku sonu yazilmiyordu
          String eachSub=  str.substring(i,i+4); //fazla cikmasini engellemek icin ustte -4 yazdik.
            System.out.println(eachSub);
        }











    }
}
