import java.util.*;

public class Anagram
{
    public static void main(String[] args)
    {
        String string1 = "listen";
        String string2 = "silent";
        
        boolean anagram = false;

        if(string1.length() == string2.length())
            {
                char[] string1Array = string1.toCharArray();
                char[] string2Array = string2.toCharArray();
    
                Arrays.sort(string1Array);
                Arrays.sort(string2Array);

                if(Arrays.equals(string1Array, string2Array))
                    {
                        anagram = true;
                    }
            }
        
        System.out.println("These strings are anagrams: " + anagram);
    }
}