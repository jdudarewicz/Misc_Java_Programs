import java.util.*;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] toSort = {1,4,3,2,33,424,76,5,6,2};
        for(int i = 0; i < toSort.length; i++)
            {
                int minPos = i;
                for (int j = i + 1; j < toSort.length; j++)
                    {
                        if(toSort[j] < toSort[minPos])
                                minPos = j;
                    }
                int temp = toSort[minPos];
                toSort[minPos] = toSort[i];
                toSort[i] = temp;
            }
        System.out.println(Arrays.toString(toSort));

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the element you would like to search for: ");
        int toSearch = in.nextInt();

        int low = 0;
        int high = toSort.length-1;
        int mid = (low+high)/2;
        boolean found = false;

        while(low <= high)
            {
                mid = (low + high) / 2;
                if(toSort[mid] < toSearch)
                    {
                        low = mid + 1;
                    }
                else if(toSort[mid] > toSearch)
                    {
                        high = mid - 1;
                    }
                else
                    {
                        found = true;
                        break;
                    }
            }

        if(found == false)
            {
                System.out.println("Element could not be found");
            }
        else
            {
                System.out.println("Element " + toSearch + " found at index " + mid);
            }
    }
}