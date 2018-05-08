import java.util.*;

public class ReturnEven
{
    public static void main(String[] args)
    {
        int[] a1 = {12,342,55,4243,574,112,0,9};

        System.out.println(evenCounter(a1));
    }

    public static int evenCounter(int[] originalArray)
    {
        int counter = 0;

        for(int i = 0; i < originalArray.length; i++)
            {
                if(originalArray[i]%2 == 0)
                    {
                        counter++;
                    }
            }
        return counter;
    }
}