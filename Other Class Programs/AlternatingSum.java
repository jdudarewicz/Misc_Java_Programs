public class AlternatingSum
{
    public static void main(String[] args)
    {
        int[] alternatingSum = {1,2,3,4,5,6,7,8,9};
        System.out.println("The alternating sum is " + summator(alternatingSum));
    }
    public static int summator(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            {
                if(i % 2 == 0)
                        sum = sum + array[i];
                else
                        sum = sum - array[i];
            }
        return sum;
    }
}