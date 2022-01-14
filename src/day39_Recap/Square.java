package day39_Recap;

import day39_Recap.shapeTask.Shape;

public class Square extends Shape {
    private double side;

    public Square( double side) {
        super("Square");
      setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid number");
            System.exit(1);
            this.side = side;
        }

    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}