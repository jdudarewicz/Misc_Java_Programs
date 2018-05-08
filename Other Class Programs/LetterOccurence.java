import java.util.*;

public class LetterOccurence
{
    public static void main(String[] args)
    {
        String input = "RIPmycompscigrade";
        int[] count = new int[26];
        char tmp;
    
        input = input.toUpperCase();
    
        for(int i = 0; i < input.length(); i++)
            {
                tmp = input.charAt(i);
                count[tmp - 'A']++;
            }
        for(int i = 0; i < count.length; i++)
            {
                System.out.println((char)(i+'A') + ": " + count[i]);
            }
    }
}