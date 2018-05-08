import java.lang.*;

public class LowOrHigh
{
    public static void main(String[] args)
    {
        double x = Math.random();

        if (x < 0.5)
        {
            System.out.println(x);
            System.out.println("Low");
        }
        else
        {
            System.out.println(x);
            System.out.println("High");
        }
    }
}