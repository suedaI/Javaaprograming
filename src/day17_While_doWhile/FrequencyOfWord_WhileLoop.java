package day17_While_doWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency = 0;
        while (str.contains("Java")){

           str= str.replaceFirst("Java", "");
            frequency++;

        }

        System.out.println(frequency);
        System.out.println("-----------------");
        String sentence = "cat cat cat cat dog dog dog dog";
        sentence=sentence.replaceFirst("cat","");

        int countCat = 0;
        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);
            }
        }







