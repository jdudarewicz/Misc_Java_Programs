public class SumOfElements
{
    public static void main(String[] args)
    {
        int[] array1 = {5,5,1,2,7};

        boolean condition = isSum(array1);

        System.out.println("Condition is: " + condition);
    }

    public static boolean isSum(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            {
                int sum1 = 0;
                int sum2 = 0;
                for(int j = 0; j <= i; j++)
                    {
                        sum1 = sum1+a[j];
                    }
                for(int j = i + 1; j < a.length; j++)
                    {
                        sum2 = sum2+a[j];
                    }
                
                if(sum1 == sum2)
                    {
                        return true;
                    }
            }
        return false;
    }
}