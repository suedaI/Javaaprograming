package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }


    static {  //runs first before anything,and oly runs one time
        System.out.println("static block");
    }
}
