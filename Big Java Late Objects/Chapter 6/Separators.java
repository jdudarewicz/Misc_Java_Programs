public class Separators
{
    public static void main(String[] args)
    {
        String[] separated = {"These", "are", "separated", "by", "separators"};
        String separator = " | ";

        for (int i = 0; i < separated.length; i++)
            {
                if (i > 0)
                    {
                        System.out.print(separator);
                    }
                System.out.print(separated[i]);
            }
    }
}