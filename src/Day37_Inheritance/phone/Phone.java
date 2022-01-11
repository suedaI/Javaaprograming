package Day37_Inheritance.phone;

public class Phone { //only contains the common features of all the subclass
    public String brand;
    public String model,size;
    public double price;
    public String color;
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    static {
        hasBattery=true;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling"+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+ " is texing"+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                ", color='" + color + '\'' +
                '}';
    }
}
