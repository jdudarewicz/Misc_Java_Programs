import java.util.*;

public class BooleanDifference
{
    public static void main(String[] args)
    {
        boolean[] a1 = {true,true,false,false,false,true};
        boolean[] a2 = {false,true,false,true,true,true};

        System.out.println(differenceCounter(a1,a2));
    }

    public static int differenceCounter(boolean[] first, boolean[] second)
    {
        int counter = 0;
        for (int i = 0; i < first.length; i++)
            {
                if (first[i] == second[i])
                    {
                        counter++;
                    }
            }
        return counter;
    }
}