import java.io.*;

public class PointCPTest2 {
    public static void main(String[] args) {
        PointCP2 point;

        System.out.println("Polar Coordinates Conversion Program");

        // Check if the user input coordinates from the command line
        // If he did, create the PointCP2 object from these arguments.
        // If he did not, prompt the user for them.
        try
        {
            point = new PointCP2(Double.valueOf(args[0]).doubleValue(),
                    Double.valueOf(args[1]).doubleValue());
        }
        catch(Exception e)
        {
            // If we arrive here, it is because either there were no
            // command line arguments, or they were invalid
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
        System.out.println("X-coordinate as Cartesian: " + point.getX());
        System.out.println("Y-coordinate as Cartesian: " + point.getY());
    }

    private static PointCP2 getInput() throws IOException
    {
        byte[] buffer = new byte[1024];  //Buffer to hold byte input
        boolean isOK = false;  // Flag set if input correct
        String theInput = "";  // Input information

        //Information to be passed to the constructor
        double rho = 0.0;
        double theta = 0.0;

        // Allow the user to enter the two different arguments
        for (int i = 0; i < 2; i++)
        {
            while (!(isOK))
            {
                isOK = true;  //flag set to true assuming input will be valid

                // Prompt the user
                System.out.print("Enter the value of "
                        + (i == 0 ? "Rho " : "Theta ")
                        + "using a decimal point(.): ");

                // Get the user's input

                // Initialize the buffer before we read the input
                for(int k=0; k<1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                // Verify the user's input
                try
                {
                    //Convert the input to double values
                    if (i == 0)
                        rho = Double.valueOf(theInput).doubleValue();
                    else
                        theta = Double.valueOf(theInput).doubleValue();
                }
                catch(Exception e)
                {
                    System.out.println("Incorrect input");
                    isOK = false;  //Reset flag as so not to end while loop
                }
            }

            //Reset flag so while loop will prompt for other arguments
            isOK = false;
        }
        //Return a new PointCP2 object
        return (new PointCP2(rho, theta));
    }
}
