import java.util.*;

public class CounterTester
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        Scanner in = new Scanner(System.in);

        System.out.println("Type 'click' to click in a clicker, 'reset' to reset the clicker, and type anything else to quit:");
        String input = in.next();

        while(input.equals("click") || input.equals("reset"))
            {
                if(input.equals("click"))
                    {
                        tally.count();
                    }

                if(input.equals("reset"))
                    {
                        tally.reset();
                    }
                    input = in.next();
            }

        System.out.println("The clicker has a value of " + tally.getValue() + " clicks.");
    }
}