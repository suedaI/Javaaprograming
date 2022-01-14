package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("camry",2022,32987,"white",123);
        Bmw BMW=new Bmw("x5",2020, 0x13ea,"black",2000);
        Tesla tesla=new Tesla("mdel s",2021,5679,"red",234);

        System.out.println(tesla);
        System.out.println(toyota);
        System.out.println(BMW);

        toyota.start();
        tesla.start();
        BMW.start();



    }
}
