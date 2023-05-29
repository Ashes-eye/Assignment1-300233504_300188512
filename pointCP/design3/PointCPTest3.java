import java.io.*;
public class PointCPTest3
{
    public static void main(String[] args)
    {
        PointCP3 point;

        System.out.println("Cartesian-Polar Coordinates Conversion Program");

        try
        {
            point = new PointCP3(
                    Double.valueOf(args[0]).doubleValue(),
                    Double.valueOf(args[1]).doubleValue());
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

    private static PointCP3 getInput() throws IOException
    {
        byte[] buffer = new byte[1024];
        boolean isOK = false;
        String theInput = "";

        double a = 0.0;
        double b = 0.0;

        for (int i = 0; i < 2; i++)
        {
            while (!(isOK))
            {
                isOK = true;

                if (i == 0)
                {
                    System.out.print("Enter the value of X: ");
                }
                else
                {
                    System.out.print("Enter the value of Y: ");
                }

                for(int k=0; k<1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                try
                {
                    if (i == 0)
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

        return (new PointCP3(a, b));
    }
}

