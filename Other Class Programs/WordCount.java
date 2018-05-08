public class WordCount
{
    public static void main(String[] args)
    {
        String countThis = "This is a test of a bunch of random words to count";
        System.out.println("There are " + count(countThis) + " words in \"" + countThis + "\"");
    }
    public static int count(String input)
    {
        int wordCount = 0;
        for(int i = 1; i < input.length(); i++)
            {
                if((input.charAt(i - 1) == ' ') && (input.charAt(i) != ' '))
                    wordCount++; 
            }
        return wordCount + 1;
    }
}