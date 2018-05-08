import java.util.*;

public class SentinelValues
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a value you want to add. To quit, enter -1: ");
        int input = 0;
        
        while(input > -1)
            {
                input = in.nextInt();
                if (input > -1)
                    {
                        sum = sum + input;
                    }
            }

        System.out.println(sum);
    }
}