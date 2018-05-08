import java.util.Arrays;

public class LongestAscendingSequence
{
    public static void main(String[] args)
    {
        int[] a1 = {1,6,5,2,7,8,9,1};

        System.out.println(longestAscending(a1));
    }

    public static int longestAscending(int[] input)
    {
        int counter = 1;
        int max = 1;

        for(int i = 1; i < input.length; i++)
            {
                if(input[i - 1] < input[i])
                    {
                        counter++; 
                        if(counter >= max)
                            {
                                max = counter;
                            }
                    }
                else
                    {
                        counter = 1;
                    }
            }

        return max;
    }
}