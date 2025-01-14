package models;

public class Square  implements Ishape{
    public int x;


    public Square() {}

    public Square(int x) {
            setX(x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }


    @Override
    public double perimeter() {
        return 4 * x;
    }

    @Override
    public double area() {
        return x * x;

    }

    @Override
    public String toString() {
        return "Square: " + "The area of the square is " + area() + " and the perimeter??: " + perimeter();
    }
}
