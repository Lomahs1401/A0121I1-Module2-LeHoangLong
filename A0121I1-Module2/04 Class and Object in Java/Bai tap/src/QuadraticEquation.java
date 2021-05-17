public class QuadraticEquation {
    private float a, b, c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
