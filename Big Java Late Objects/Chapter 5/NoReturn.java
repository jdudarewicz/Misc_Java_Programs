import java.util.Scanner;

public class NoReturn
{
    public static void boxString(String contents)
    {
        int n = contents.length();
        for (int i = 0; i < n + 2; i++)
            {
                System.out.print("-");
            }
        System.out.println("\n*" + contents + "*");
        for (int i = 0; i < n + 2; i++)
            {
                System.out.print("-");
            }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userInput = in.next();
        boxString(userInput);
    }
}