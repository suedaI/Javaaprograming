package day17_While_doWhile;

import org.w3c.dom.ls.LSOutput;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str= "Cat Cat Dog Dog";

        int frequence = 0;
        for (int i = 0; i < str.length()-3; i++) {
            String eachSub = str.substring(i, i + 3);
            if (eachSub.equalsIgnoreCase("Cat")){
                frequence++;
            }
        }
        System.out.println(frequence);

    }

}
