import java.util.*;

public class Sort
{
    public static void main(String[] args)
    {
        int[] values = {4,2,6,77,9,1,3,5};
        int tmp = 0;
        boolean sorted = false;
        
        while(!sorted)
            {
                int counter = 0;
                for(int i = 1; i < values.length; i++)
                    {
                        if (values[i - 1] > values[i])
                            {
                                tmp = values[i - 1];
                                values[i - 1] = values[i];
                                values[i] = tmp;
                            }
                        else if (counter >= (values.length - 2))
                            {
                                sorted = true;
                                break;
                            }
                        else
                            {
                                counter++;
                            } 

                    }
            }
        
            System.out.println(Arrays.toString(values));
    }
}