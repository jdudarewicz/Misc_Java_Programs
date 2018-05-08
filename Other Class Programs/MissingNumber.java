public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,9,10};
        int n = array.length + 1;
        int toTotal = missing(array, n);
        System.out.println("The missing integer value is: " + toTotal);
    }

    public static int missing(int[] a, int n)
    {
        int expectedSum = 0;
        int arraySum = 0;
        for(int i = 1; i <= n; i++)
            {
                expectedSum = expectedSum + i;
            }
        for(int i = 0; i < a.length; i++)
            {
                arraySum = arraySum + a[i];
            }
        
        return expectedSum - arraySum;
    }
}