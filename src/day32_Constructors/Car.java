package day32_Constructors;

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;


    public Car(String brand) {
this.brand=brand;
    }

    public Car(String brand,String model){
        this(brand);
        this.model=brand;
    }

    public Car(String brand,String model,int year){
        this(brand,model);
        this.year=year;
    }
    public Car (String brand,String model,int year,String color){
        this(brand,model,year);
        this.color=color;
    }
    public Car(String brand,String model,int year,String color,double price){
        this(brand, model, year, color);
        this.price=price;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}