package day35_Encapsulation;

public class Person {
    public String name;
    public int age ;
    public char gender;
    public String language;

    public static String planet;
    public static  boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;


    static {
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
        planet="word";
    }

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    public static void printPlanetName(){
        System.out.println("planet name is "+planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drink "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
