import java.util.*;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] a = {55,43,2,6,7,8,1};
        
        for(int i = 1; i < a.length; i++)
            {
                int index = i;
                int next = a[i];

                while(index > 0 && a[index - 1] > next)
                    {
                        a[index] = a[index - 1];
                        index--;
                    }
                a[index] = next;
            }
        System.out.println(Arrays.toString(a));
    }
}