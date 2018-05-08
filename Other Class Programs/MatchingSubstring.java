public class MatchingSubstring
{
    public static void main(String[] args)
    {
        String input = "canada";
        String substring = "ada";

        System.out.println(find(input, substring));
    }

    public static boolean find(String input, String substring)
    {
        if (input.length() == 1)
            {
                return false;
            }
        else if (input.substring(0, substring.length()).equals(substring))
            {
                return true;
            }
        return find(input.substring(1, input.length()), substring);
    }
}