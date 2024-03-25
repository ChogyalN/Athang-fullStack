package abstraction;

public class Circle implements Drawable{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is a method from interface drawable");
    }

    @Override
    public double area() {
        return (radius*radius*Math.PI);
    }
}
