package Day37_Inheritance.phone;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone1=new Iphone("12 pro","max",1200,"blue");

        iphone1.facetime(703826879);
        System.out.println(iphone1);


        Samsung samsung=new Samsung("galaxy","156",1200,"white");
Nokia nokia=new Nokia("brick","4 inc",1900,"black");
        System.out.println("============================================");
iphone1.call(345666);
iphone1.faceTime("sueda@gmail.com");
iphone1.facetime(345677889);
samsung.call(4567876);
samsung.text(44556667);
samsung.freeze();
nokia.call(34566777);
nokia.text(4456788);
nokia.selfDefense();
        System.out.println("======================");
        System.out.println(Iphone.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(Phone.hasBattery);
        System.out.println(Samsung.hasBattery);








    }
}
