import java.util.*;

public class LinearSearch
{
    public static void main(String[] args)
    {
        String[] separated = {"These", "are", "separated", "by", "separators"};
        int position = 0;
        boolean found = false;

        while(position < separated.length && !found)
            {
                if (separated[position].equals("are"))
                    {
                        found = true;
                    }
                else
                    {
                        position++;
                    }
            }
        
        if (found)
            {System.out.println("Found at position " + position);}
        else
            {System.out.println("Could not find value");}
        
        for (int i = position + 1; i < separated.length; i++)
            {
                separated[i - 1] = separated[i];
            }
        System.out.println(Arrays.toString(separated));
    }
}