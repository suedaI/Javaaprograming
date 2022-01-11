package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTask {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);//public always access
        System.out.println(AccessModifiers.defaultData);//default is not visible outside the package
        //private is not visible outside the class

        AccessModifiers.method1();
        AccessModifiers.method2();//default methods 
        //private methods is not visible outside



    }




}
