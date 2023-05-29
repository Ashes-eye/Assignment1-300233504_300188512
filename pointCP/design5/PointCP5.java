public abstract class PointCP5 {
   //No instance variables as it only

    //Abstract methods **************************************************


    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract double getDistance(PointCP5 point);
    public abstract PointCP5 rotatePoint(double rotation);
    public abstract String toString();



}
