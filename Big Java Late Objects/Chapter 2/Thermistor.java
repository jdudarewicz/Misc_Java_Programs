import java.util.Scanner;

public class Thermistor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int R0 = 1075;
        final int T0 = 85;
        final int B = 3969;

        System.out.print("Enter the resistance of the thermistor: ");
        int resistance = in.nextInt();
        
        double liquidTemp = ((B * T0) / ((T0 * Math.log(resistance / R0)) + B)) - 273;

        System.out.printf("The tempurature of the liquid flowing through the pipes is " + liquidTemp);
        System.out.print(" degrees celcius.");
    }
}