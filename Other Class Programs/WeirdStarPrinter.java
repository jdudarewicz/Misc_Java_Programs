public class WeirdStarPrinter
{
    public static void main(String[] args)
    {
        int n = 5;
        starPrinter(n);
    }
    public static void starPrinter(int n)
    {
        String spaces = " ";
        String stars = "*";
        String toPrint = "";

        for(int i = 0; i < n; i++)
            {
                toPrint = toPrint + "* ";
            }
        for(int i = 0; i < n; i++)
            {
                if(i % 2 == 0)
                    {
                        System.out.println(" " + toPrint);
                    }
                else
                    {
                        System.out.println(toPrint);
                    }
            }
    }
}