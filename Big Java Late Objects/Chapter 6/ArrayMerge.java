import java.util.*;

public class ArrayMerge
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,4,9,16));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(9,7,4,9,11));

        ArrayList<Integer> merged = new ArrayList<Integer>(merge(a,b));
        for(int i = 0; i < merged.size(); i++)
            {System.out.print(merged.get(i) + " ");}
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> merged = new ArrayList<Integer>();

        int iA = 0;
        int iB = 0;
        for(int i = 0; i < a.size() + b.size(); i++)
            {
                if(iA < a.size() && iB < b.size())
                    {
                        if(i % 2 == 0)
                            {merged.add(a.get(iA++));}
                        else
                            {merged.add(b.get(iB++));}
                    }
                else
                    {
                        if(iA < a.size())
                            {merged.add(a.get(iA++));}
                        if(iB < b.size())
                            {merged.add(b.get(iB++));}
                    }
            }
        return merged;
    }
}