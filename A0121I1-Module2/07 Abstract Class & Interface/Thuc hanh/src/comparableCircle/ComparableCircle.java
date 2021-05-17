package comparableCircle;

//Interface nhận tham số T là lớp ComparableCircle, nghĩa là ta sẽ so sánh hai đối tượng của lớp
// ComparableCircle với nhau theo 1 tiêu chuẩn nào đó, bằng cách triển khai phương thức compareTo()
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        }
        else if (getRadius() < o.getRadius()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}