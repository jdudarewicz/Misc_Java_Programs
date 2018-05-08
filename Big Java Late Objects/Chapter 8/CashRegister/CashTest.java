public class CashTest
{
    public static void main(String[] args)
    {
        CashRegister cash1 = new CashRegister();

        cash1.addItem(2.99);
        cash1.addItem(4.00);
        cash1.addItem(9.99);
        cash1.addItem(5.99);
        cash1.addItem(2.99);
        cash1.addItem(4.00);
        cash1.addItem(9.99);
        cash1.addItem(5.99);
        cash1.addItem(2.99);
        cash1.addItem(4.00);
        cash1.addItem(9.99);
        cash1.addItem(5.99);
        cash1.addItem(2.99);
        cash1.addItem(4.00);
        cash1.addItem(9.99);
        cash1.addItem(5.99);
        cash1.addItem(2.99);
        cash1.addItem(4.00);
        cash1.addItem(9.99);
        cash1.addItem(5.99);

        cash1.displayAll();

        System.out.print("Your total is $" + cash1.getTotal());

    }
}