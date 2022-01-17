package day39_Recap.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length == 0) {
            System.out.println("invalid number");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width == 0) {
            System.out.println("invalid number");
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectange");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

}
