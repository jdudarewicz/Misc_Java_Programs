import java.util.*;

public class StringTally
{
    public static void main(String[] args)
    {
        String mine= "MyString";
        mine = mine.toUpperCase();

        int[] tally = new int[26];
        
        for(int i = 0; i < mine.length(); i++)
            {
                char tmp = mine.charAt(i);
                tally[tmp - 'A']++;
            }
        
        for(int i = 0; i < tally.length; i++)
            {System.out.println((char) (i+'A') + ": " + tally[i]);}
    }
}