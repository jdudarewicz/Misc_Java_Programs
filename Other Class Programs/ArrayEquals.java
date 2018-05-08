import java.util.Arrays;

public class ArrayEquals
{
    public static void main(String[] args)
    {
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};
    
        if (Arrays.equals(a1, a2))
            {
                System.out.println("They are equal.");
            }
        else
            {
                System.out.println("They are not equal.");
            }
    }
}