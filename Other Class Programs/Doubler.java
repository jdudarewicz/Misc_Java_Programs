import java.util.*;

public class Doubler
{
    public static void main(String[] args)
    {
        int[] a1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(doubler(a1)));
    }

    public static int[] doubler(int[] input)
    {
        int[] newArray = new int[input.length*2];
        
        for (int i = 0; i < input.length; i++)
            {
                newArray[2*i] = input[i];
                newArray[2*i+1] = input[i];
            }
        return newArray;
    }
}