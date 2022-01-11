package day32_Constructors;

public class ConstuctorCalls {
    public ConstuctorCalls(){
        System.out.println("defalt Constructor");
    }
    public ConstuctorCalls(int a){
        this();
        System.out.println("consructor with int argument");

    }
    public ConstuctorCalls(String str){
        this(10);
        System.out.println("constructor with String argument");
    }
}
