package models;

public class Circle implements Ishape {
    private double radius;
    private final double pi = 3.14;

    public Circle() {}

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double length() {
        return 2 * pi * radius;
    }

    @Override
    public double perimeter() {
        return length();
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return perimeter();

    }

    public double getArea() {
        return area();
    }

    @Override
    public String toString() {
        return "Circle: " + "The perimeter = " + getPerimeter() + ", the area = " + getArea();
    }
}
