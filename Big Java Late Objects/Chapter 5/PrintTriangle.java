import java.util.Scanner;

public class PrintTriangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sidelength of the triangle you want to print: ");
        int userInput = in.nextInt();
        printTriangle(userInput);
    }
    public static void printTriangle(int sidelength)
    {
        if (sidelength < 1) {return;}

        printTriangle(sidelength - 1);
        for (int i = 0; i < sidelength; i++)
            {
                System.out.print("[]");
            }
            System.out.println();
    }
}