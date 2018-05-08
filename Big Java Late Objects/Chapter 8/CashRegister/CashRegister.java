import java.util.*;

public class CashRegister
{
    private static int dailyTransactionNumber = 0000;
    private ArrayList<Double> item = new ArrayList<Double>();
    private double total;

    public CashRegister()
    {
        total = 0;
    }

    public void addItem(double a)
    {
        item.add(a);
    }

    public void clear()
    {
        item.clear();
        dailyTransactionNumber++;
    }

    public double getTotal()
    {
        for(int i = 0; i < item.size() - 1; i++)
            {
                total = total + item.get(i);
            }
        return total;
    }

    public int getCount()
    {
        return item.size();
    }

    public void displayAll()
    {
        System.out.println("Transaction #" + dailyTransactionNumber + " currently contains items: ");
        
        for(int i = 0; i < item.size() - 1; i++)
            {
                int index = i + 1;
                if(index < 10)
                    System.out.println(index + "....." + item.get(i));
                if(index >= 10)
                    System.out.println(index + "...." + item.get(i));
            }
    }
}