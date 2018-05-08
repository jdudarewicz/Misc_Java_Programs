import java.util.*;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] toSort = {3,6,2,8,2421,66,1,9};

        for(int i = 0; i < toSort.length; i++)
            {
                int minPos = i;
                for(int j = i + 1; j < toSort.length; j++)
                    {
                        if(toSort[minPos] > toSort[j])
                            {minPos = j;}
                    }
                int temp = toSort[minPos];
                toSort[minPos] = toSort[i];
                toSort[i] = temp;
            }
        System.out.println(Arrays.toString(toSort));
    }
}