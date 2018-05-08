import java.util.*;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] toSort = {1,4,3,2,33,424,76,5,6,2};
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value you would like to search for: ");
        int toFind = in.nextInt();
        int index = -1;
        for(int i = 0; i < toSort.length; i++)
            {
                if(toSort[i] == toFind)
                    {
                        index = i;
                        break;
                    }
            }
        if(index < 0)
            {
                System.out.println("The element " + toFind + " is not in the array");
            }
        else
            {
                System.out.println("The element " + toFind + " is located at index " + index);
            }
    }
}