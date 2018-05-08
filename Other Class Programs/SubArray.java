import java.util.Arrays;

public class SubArray
{
    public static void main(String[] args)
    {
        int[] a1 = {12,54,76,321,76,96,5654,8,65,2,85,73,654,253,1};

        System.out.println(Arrays.toString(subArray(a1, 2, 10)));
    }

    public static int[] subArray(int[] input, int start, int end)
    {
        int[] newArray =  new int[end - start + 1];

        for(int i = 0; i < newArray.length; i++)
            {
                newArray[i] = input[i + start];
            }
        
        return newArray;
    }
}