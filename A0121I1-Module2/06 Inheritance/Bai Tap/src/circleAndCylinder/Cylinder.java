package circleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight() + ",bán kính = " + getRadius()
                + ",color = " + getColor() + ", diện tích = " + getArea() + ",thể tích = " + getVolume();
    }
}
