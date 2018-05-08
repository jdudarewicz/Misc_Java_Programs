public class SubstringLocator
{
    public static void main(String[] args)
    {
        String str1 = "Mississippi";
        String str2 = "sip";
        boolean isTrue = find(str1,str2);

        System.out.println(isTrue);
    }

    public static boolean find(String str, String subString)
    {
        if(str.length() <= 0 && subString.length() <= 0 || str.length() < subString.length())
            {
                return false;
            }
        else if(str.substring(0, subString.length()).equals(subString))
            {
                return true;
            }
        else
            return find(str.substring(1), subString);
    }
}