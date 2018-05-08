public class IsPalindrome
{
    public static void main(String[] args)
    {
        String test = "rotor";
        boolean isIt = isPalindrome(test);

        System.out.println("Palindrome truth value: " + isIt);
    }

    public static boolean isPalindrome(String s)
    {
        if(s.length() <= 1)
            {
                return true;
            }
        else if(s.charAt(0) == s.charAt(s.length() - 1))
            {
                return isPalindrome(s.substring(1, s.length() - 1));
            }
        else
            return false; 
    }
}