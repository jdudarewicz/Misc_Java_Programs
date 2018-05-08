import java.util.Scanner;

public class RecursionTriangle
{
    public static void printTriangle(int sideLength)
    {
        if (sideLength < 1)
            {
                return;
            }
        printTriangle(sideLength - 1);
        for (int i = 0; i < sideLength; i++)
            {
                System.out.print("[]");
            }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the amount of lines you would like to print: ");
        int userInput = in.nextInt();
        printTriangle(userInput);
    }
}