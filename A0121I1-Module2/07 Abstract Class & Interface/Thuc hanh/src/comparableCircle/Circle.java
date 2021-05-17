package comparableCircle;

public class Circle extends Shape {
    private double radius = 3.0; //gia tri mac dinh radius = 3.0

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "  + getRadius()
                + ", color = " + getColor() + (isFilled() ? ", filled" : ", not filled")
                + ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}

