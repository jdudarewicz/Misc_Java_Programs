import java.util.*;

public class RunningSum
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sumRunner(a)));
    }

    public static int[] sumRunner(int[] a)
    {
        int[] returnArray = new int[a.length];

        returnArray[0] = a[0];

        for(int i = 1; i < a.length; i++)
            {
                returnArray[i] = returnArray[i-1] + a[i];
            }

        return returnArray;
    }
}