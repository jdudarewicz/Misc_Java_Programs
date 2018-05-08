import java.util.Scanner;

public class EscapeVelocity
{
    public static void main(String[] args)
    {
        final double GCONSTANT = 6.67*Math.pow(10, -11);
        final double MCOMET = 1.3*Math.pow(10,22);
        final double CRADIUS = 1.153*Math.pow(10,6);

        double halleyEscapeVelocity = Math.sqrt(2*((GCONSTANT*MCOMET)/CRADIUS));
        double returnMass = ((CRADIUS)*(Math.pow(halleyEscapeVelocity, 2) / 2)) / GCONSTANT;

        Scanner in = new Scanner(System.in);

        System.out.println("Input your desired launch velocity");
        double launchVelocity = in.nextDouble();

        if (launchVelocity > halleyEscapeVelocity)
        {
            System.out.println("You will not return to the surface of halleys comet.");
            System.out.printf("To return to the surface of halleys comet, the comet would need to weigh: " + "%.2f", returnMass);
            System.out.println("kg.");
        }
        else
        {
            System.out.println("You will return to the surface of the comet.");
        }
    }
}