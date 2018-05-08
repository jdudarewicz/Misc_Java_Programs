import java.util.*;

public class IndexAdder
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(indexAdder(a)));
    }

    public static int[] indexAdder(int[] input)
    {
        int[] newArray = new int[input.length];

        for(int i = 0; i < input.length; i++)
            {
                for(int j = 0; j <= i; j++)
                    {
                        newArray[i] = newArray[i] + input[j]; 
                    }
            }
        
        return newArray;
    }
}