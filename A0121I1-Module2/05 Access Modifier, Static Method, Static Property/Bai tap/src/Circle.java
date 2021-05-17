public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = 3.14159;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

}
