import java.util.*;

public class DoubleArray
{
    public static void main(String[] args)
    {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = new int[a1.length*2];

        int a2index = 0;
        for(int i = 0; i < a1.length; i++)
            {
                a2[a2index++] = a1[i];
                a2[a2index++] = a1[i];
            }
            
        System.out.println(Arrays.toString(a2));
    }
}