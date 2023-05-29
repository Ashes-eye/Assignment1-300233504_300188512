//Modifying original PointCP class.
//Store cartesian coordinates only.
public class PointCP3
{
    //Instance variables ************************************************

    /**
     * Delete the typeCoord because for design3 we don't need it.
     * Only store cartesian coordinates.
     */

    /**
     * Contains the current value of X for cartesian coordinates.
     */
    private double x;

    /**
     * Contains the current value of Y for cartesian coordinates.
     */
    private double y;


    //Constructors ******************************************************

    /**
     * Constructs a cartesian coordinate object, no need to identify the type for design3.
     */
    public PointCP3(double x, double y){
        this.x = x;
        this.y = y;
    }





    //Instance methods **************************************************


    public double getX()
    {

            return x;
    }

    public double getY()
    {

            return y;
    }

    public double getRho()
    {

            return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta()
    {
            return Math.toDegrees(Math.atan2(y, x));
    }


    /**
     * Delete the convert method as for design 3, only cartesian coordinates need storing.
     */


    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP3 pointB)
    {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = x - pointB.getX();
        double deltaY = y - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP3 rotatePoint(double rotation)
    {
        //No need to set X and Y variables as X is x and Y is y.
        //Nothing needs to be calculated.
        double radRotation = Math.toRadians(rotation);

        return new PointCP3(
                (Math.cos(radRotation) * x) - (Math.sin(radRotation) * y),
                (Math.sin(radRotation) * x) + (Math.cos(radRotation) * y));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as  Cartesian  (" + x + "," + y + ")";
    }
}
