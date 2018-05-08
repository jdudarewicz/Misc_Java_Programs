public class FilingArray
{
    public static void main(String[] args)
    {
        int[] squares = new int[1000];
        for (int i = 0; i < squares.length; i++)
            {
                squares[i] = i * i;
            }
        for (int i = 0; i < squares.length; i++)
            {
                System.out.println(squares[i]);
            }
    }
}