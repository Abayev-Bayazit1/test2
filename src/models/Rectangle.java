package models;

public class Rectangle implements Ishape {
    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
            setLength(length);
            setWidth(width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    public double getPerimeter() {
        return perimeter();
    }

    public double  getArea(){
        return area();
    }

    @Override
    public String toString() {
        return "Rectangle: " + "The area is " + getArea() + " and the perimeter is " + getPerimeter() ;
    }
}
