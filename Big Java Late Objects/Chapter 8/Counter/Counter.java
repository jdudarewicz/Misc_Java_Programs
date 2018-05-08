public class Counter
{
    private int value;

    public Counter()
    {
        value = 0;
    }

    public void count()
    {
        value++;
    }

    public int getValue()
    {
        return value;
    }

    public void reset()
    {
        value = 0;
    }
}