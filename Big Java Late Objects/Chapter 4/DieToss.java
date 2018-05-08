//This program tests random die tosses
import java.util.Scanner;

public class DieToss
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 'roll' to roll the die, or type 'quit' to exit");
        int roll = 0;
        while (true)
            {
                String userInput = in.next();
                    if (userInput.equals("quit"))
                        {
                            break;
                        }
                    else if (userInput.equals("roll"))
                        {
                            roll = (int)(Math.random()*6 + 1);
                            System.out.println(roll);
                        }
            }
    }
}