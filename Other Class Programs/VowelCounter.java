public class VowelCounter
{
    public static void main(String[] args)
    {
        String toCount = "This String will have it's vowels counted";
        System.out.println(count(toCount));
    }
    public static int count(String toCount)
    {
        int vowelCount = 0;
        toCount = toCount.toUpperCase();
        for(int i = 0; i < toCount.length(); i++)
            {
                if(toCount.charAt(i) == 'A' || toCount.charAt(i) == 'E' || toCount.charAt(i) == 'I' || toCount.charAt(i) == 'O' || toCount.charAt(i) == 'U')
                    {
                        vowelCount++;
                    }
            }
        return vowelCount;
    }
}