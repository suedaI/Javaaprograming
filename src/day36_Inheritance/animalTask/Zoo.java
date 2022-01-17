package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("max","husky",'f',"small",2,"white");
        dog.eat();
        dog.bark();
        dog.drink();
        dog.moving();
        dog.sleeping();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"small",3,"brown");

        cat.eat();
        cat.sleeping();
        cat.drink();
        cat.moving();
        // cat.bark();
        //  cat.hunt();
        //cat only do limitted
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "small", 4, "Orange");

        tiger.eat();
        tiger.sleeping();
        tiger.drink();
        tiger.moving();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();


    }
}
