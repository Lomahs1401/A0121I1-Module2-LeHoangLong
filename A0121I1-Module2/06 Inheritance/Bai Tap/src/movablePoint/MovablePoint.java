package movablePoint;

public class MovablePoint extends Point{
    private float XSpeed = 0.0f;
    private float YSpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.XSpeed = xSpeed;
        this.YSpeed = ySpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.XSpeed = xSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.YSpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public float[] getSpeed() {
        return new float[]{getX(), getY(), getXSpeed(), getYSpeed()};
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.XSpeed= xSpeed;
        this.YSpeed= ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint(X, Y, XSpeed, YSpeed) = (" + x + ", " + y + ", " + XSpeed + ", " + YSpeed + ')';
    }
}