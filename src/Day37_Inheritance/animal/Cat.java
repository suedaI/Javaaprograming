package Day37_Inheritance.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
