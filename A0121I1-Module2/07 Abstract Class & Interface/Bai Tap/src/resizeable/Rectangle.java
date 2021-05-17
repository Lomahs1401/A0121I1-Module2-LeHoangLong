package resizeable;

public class Rectangle extends Shape implements Resizeable {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "  + getWidth() + ", length = " + getLength()
                + ", color = " + getColor() + (isFilled() ? ", filled" : ", not filled")
                + ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent / 100 ;
    }
}

