public class StringReverse
{
    public static void main(String[] args)
    {
        String toReverse = "Reverse this";
        String reversed = reverse(toReverse);
        System.out.println("Original word: " + toReverse + ", reversed word: " + reversed);
    }

    public static String reverse(String toReverse)
    {
        if(toReverse.length() == 0)
            {
                return "";
            }
        return reverse(toReverse.substring(1)) + toReverse.charAt(0);
    }
}