package Day37_Inheritance.animal;

import java.util.concurrent.Callable;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1=new Dog("max","Husky",'M',"small",2,"black");
        System.out.println(dog1);
        dog1.bark();
        Cat cat1=new Cat("love","siemma",'F',"small",2,"white");
        cat1.scratch();
        System.out.println(cat1);
        Parrot parrot1=new Parrot("King","macow",'F',"SMALL",6,"BLUE");
        parrot1.sing();


    }
}
