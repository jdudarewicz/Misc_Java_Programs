public class SumAndAverage
{
    public static void main(String[] args)
    {
        int[] values = {42125,5343,24,45432,64542};
        int total = 0;
        
        for (int element : values)
            {
                total = total + element;
            }
        
        int average = 0;

        if (total > 0)
            {
                average = total / values.length;
                System.out.println("The average of the array is: " + average);
            }
    }
}