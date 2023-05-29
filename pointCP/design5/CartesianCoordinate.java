//Sub class for cartesianCoordinates
public class CartesianCoordinate extends PointCP5 {

    private double x;
    private double y;

    //Constructor
    public CartesianCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Abstract methods **************************************************


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRho() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double getDistance(PointCP5 point) {
        double deltaX = x - point.getX();
        double deltaY = y - point.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public PointCP5 rotatePoint(double rotation)
    {
        //No need to set X and Y variables as X is x and Y is y.
        //Nothing needs to be calculated.
        double radRotation = Math.toRadians(rotation);

        return new CartesianCoordinate(
                (Math.cos(radRotation) * x) - (Math.sin(radRotation) * y),
                (Math.sin(radRotation) * x) + (Math.cos(radRotation) * y));
    }

    public String toString()
    {
        return "Stored as  Cartesian  (" + getX() + "," + getY() + ")";
    }

}
