package day19_LoopsPractices;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                System.exit(0); //terminates the program.
            }

            System.out.println(i);


        }
        System.out.println("wooden spoon");
    }
}
