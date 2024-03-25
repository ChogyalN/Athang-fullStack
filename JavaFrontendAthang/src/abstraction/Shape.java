package abstraction;

public abstract class Shape {
    protected double length;

    protected abstract double getArea(int length, int width);

    protected void normalMethod(){
        System.out.println("This is normal method from super Shape class");
    }
}
