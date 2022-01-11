package Day37_Inheritance.phone;

public class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void facetime(long phoneNumber){
        System.out.println(brand+ " "+ model+" is facetime"+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+" "+ " is having a facetime with email "+email);
    }







}
