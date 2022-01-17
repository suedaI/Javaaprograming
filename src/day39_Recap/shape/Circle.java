package day39_Recap.shape;

public class Circle extends Shape{
    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius==0){
            System.out.println("invalid number");
        }
        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*pi;
    }

    @Override
    public double perimeter() {
        return  2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area()+
                "perimeter=" + perimeter() +
                "pi =" + pi +
                '}';
    }
}
