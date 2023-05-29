import java.io.*;
public class PointCPTest5
{
    public static void main(String[] args)
    {
        PointCP5 point;
        String coordinateType;

        System.out.println("Cartesian-Polar Coordinates Conversion Program");

        try
        {
            coordinateType = args[2].toUpperCase();
            if(coordinateType.equals("C")) {
                point = new CartesianCoordinate(
                        Double.valueOf(args[0]).doubleValue(),
                        Double.valueOf(args[1]).doubleValue());
            } else if (coordinateType.equals("P")) {
                point = new PolarCoordinate(
                        Double.valueOf(args[0]).doubleValue(),
                        Double.valueOf(args[1]).doubleValue());
            } else {
                throw new IllegalArgumentException();
            }

        }
        catch(Exception e)
        {
            if(args.length != 0)
                System.out.println("Invalid arguments on command line");

            try
            {
                point = getInput();
            }
            catch(IOException ex)
            {
                System.out.println("Error getting input. Ending program.");
                return;
            }
        }
        System.out.println("\nYou entered:\n" + point);
    }

    private static PointCP5 getInput() throws IOException
    {
        byte[] buffer = new byte[1024];
        boolean isOK = false;
        String theInput = "";

        double a = 0.0;
        double b = 0.0;
        String coordType = "";

        for (int i = 0; i < 3; i++)
        {
            while (!(isOK))
            {
                isOK = true;

                if (i == 0)
                {
                    System.out.print("Enter the type of coordinates 'C' for Cartesian, 'P' for Polar: ");

                }
                else if (i == 1)
                {
                    System.out.print("Enter the value of X or Rho: ");

                }
                else
                {
                    System.out.print("Enter the value of Y or Theta: ");
                }

                for(int k=0; k<1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                try
                {
                    if (i == 0)
                        coordType = theInput.toUpperCase();

                    else if (i == 1)
                        a = Double.valueOf(theInput).doubleValue();

                    else
                        b = Double.valueOf(theInput).doubleValue();
                }
                catch(Exception e)
                {
                    System.out.println("Incorrect input");
                    isOK = false;
                }
            }

            isOK = false;
        }

        if(coordType.equals("C")) {
            return (new CartesianCoordinate(a, b));
        } else if (coordType.equals("P")) {
            return (new PolarCoordinate(a, b));
        } else {
            throw new IllegalArgumentException("Invalid coordinate type");
        }
    }
}

