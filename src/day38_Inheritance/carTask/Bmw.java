package day38_Inheritance.carTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+ " "+model+ " breaksDown every 100 mil ");
    }
    public void racing(){
        System.out.println(brand+" "+model+ " is racing a car");
    }

    @Override
    public void start(){
    System.out.println("call mechanic to jump start "+ model+" "+brand);
    }

}
