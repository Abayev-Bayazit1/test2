package models;

public class Triangle implements Ishape {
   private double a;
   private double b;
   private double c;

   public Triangle() {}

   public Triangle(double a, double b, double c) {
       setA(a);
       setB(b);
       setC(c);
   }

   public void setA(double a) {
       this.a = a;
   }

   public double getA() {
       return a;
   }

   public void setB(double b) {
       this.b = b;
   }

   public double getB() {
       return b;
   }

   public void setC(double c) {
       this.c = c;
   }

   public double getC() {
       return c;
   }



    @Override
    public double perimeter() {
        return a + b + c;

    }

    @Override
    public double area() {
       double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
   }

   public double getPerimeter() {
       return perimeter();
   }

   public double getArea() {
       return area();
   }

   @Override
    public String toString() {
       return "Triangle is : " + "the perimeter is " + getPerimeter() + " And the area is(smth) " + getArea();
   }

}
