package abstraction;

public class Triangle extends Shape implements Drawable{
        @Override
    protected double getArea(int length, int width) {
        return (length*width)*0.5;
    }

    protected void normalMethod(){
        super.normalMethod();
    }

    @Override
    public void draw() {
        System.out.println("This is a method from interface drawable");
    }

    @Override
    public double area() {
        return 0;
    }
}
