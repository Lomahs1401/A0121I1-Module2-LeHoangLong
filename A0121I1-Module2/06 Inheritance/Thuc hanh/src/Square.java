public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    //goi ham khoi tao Rectangle co 4 tham so tren lop cha Rectangle
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    //xay dung phuong thuc setSide de truyen gia tri
    public void setSide(double side) {
        //Truyen doi so size bang 2 phuong thuc cua lop cha
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide() + ", color = " + getColor() + (isFilled() ? ", filled" : ", not filled")

                + ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
