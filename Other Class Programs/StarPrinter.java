import java.util.Scanner;

public class StarPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        int input = in.nextInt();
        starPrinter(input);
    }
    public static void starPrinter(int n)
    {
        String star = "*";
        String space = " ";
        int spaces = n;

        for(int i = 0; i <= n; i++)
            {
                for(int j = spaces; j > 0; j--)
                    {
                        System.out.print(space);
                    }
                for (int j = 0; j < ((i * 2) - 1); j++)
                    {
                        System.out.print(star);
                    }
                System.out.println(" ");
                spaces--;
            }
    }
}