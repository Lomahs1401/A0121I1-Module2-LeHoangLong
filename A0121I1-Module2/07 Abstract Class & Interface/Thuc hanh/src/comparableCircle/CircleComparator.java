package comparableCircle;

import java.util.Comparator;

//so sánh hai đối tượng của hai lớp CircleComparator và Circle với nhau
public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        }
        else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}