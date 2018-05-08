import java.util.*;

public class DigitChecker
{
    public static void main(String[] args)
    {
        int[] a1 = {32,6536,64,56,7545,2,40,89};

        System.out.println(Arrays.toString(counter(a1)));
    }

    public static int[] counter(int[] input)
    {
        int[] newArray = new int[10];
        
        for(int i = 0; i < input.length; i++)
            {
                newArray[(input[i]%10)] = newArray[(input[i]%10)] + 1;
            }
        
        return newArray;
    }
}