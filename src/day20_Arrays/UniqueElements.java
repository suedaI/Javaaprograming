package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] word= {"java","java","C#","python","python"};




        for (int j = 0; j < word.length; j++) {
            String element=word[j];
            int frequency=0;
            for(int i=0; i<word.length;i++){
                if (word[i].equals(element)){
                    frequency++;
                }
        }

            if (frequency==1){
                System.out.println(element);
            }
        }















    }
}
