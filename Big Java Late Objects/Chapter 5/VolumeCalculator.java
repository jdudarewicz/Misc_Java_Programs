import java.util.Scanner;

public class VolumeCalculator
{
    public static double cubeVolume(double sideLength)
    {
        double volume = Math.pow(sideLength, 3);
        return volume;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of a cube: ");
        double input = in.nextDouble();
        double result = cubeVolume(input);

        System.out.println("A cube with a side length of " + input + "cm has a volume of " + result + " cm cubed.");
    }
}