package abstraction;

public class AbstractMainClass {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        System.out.println("The area of triangle is = "+triangle.getArea(2, 4));

        Triangle normalMethod = new Triangle();
        normalMethod.normalMethod();

        Drawable area = new Circle(3.2);
        System.out.println("The area of a circle is = "+area.area());
    }
}
