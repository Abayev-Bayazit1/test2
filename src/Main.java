import models.Circle;
import models.Rectangle;
import models.Triangle;
import models.Ishape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ishape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(3,4));
        shapes.add(new Triangle(3,4,5));
        shapes.add(new Circle(3));

        for (Ishape shape : shapes) {
            System.out.println(shape.toString());

            }
        }
    }
