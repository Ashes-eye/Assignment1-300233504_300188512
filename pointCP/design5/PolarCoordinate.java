//Sub class for polar coordinates
public class PolarCoordinate extends PointCP5 {

    private double rho;
    private double theta;

    //Constructor
    public PolarCoordinate(double rho, double theta) {
        this.rho =rho;
        this.theta =theta;
    }

    // Implement abstract methods
    public double getX() {
        return (Math.cos(Math.toRadians(theta)) * rho);
    }

    public double getY() {
        return (Math.sin(Math.toRadians(theta)) * rho);
    }

    public double getRho() {
        return rho;
    }

    public double getTheta() {
        return theta;
    }

    public double getDistance(PointCP5 point) {
        double deltaX = getX() - point.getX();
        double deltaY = getY() - point.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public PointCP5 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PolarCoordinate(
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }


    public String toString()
    {
        return "Stored as Polar [" + getX() + "," + getY() + "]" + "\n";
    }
}
