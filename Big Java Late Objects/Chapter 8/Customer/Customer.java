public class Customer
{
    private double untilNextDiscount;
    private boolean isDiscountReached;
    private final double DISCOUNT = 10.0;
    private double currentPurchase;

    public Customer()
    {
        untilNextDiscount = 0.0;
    }

    public void makePurchase(double amount)
    {
        untilNextDiscount = untilNextDiscount + amount;
        currentPurchase = amount;
        
        if(isDiscountReached)
        {
            currentPurchase = currentPurchase - DISCOUNT;
            isDiscountReached = false;
        }
        else
        {
            if(untilNextDiscount >= 100)
            {
                isDiscountReached = this.discountReached();
            }
        }
    }

    public double afterDiscountCheck()
    {
        return currentPurchase;
    }
    
    private boolean discountReached()
    {
        untilNextDiscount = untilNextDiscount - 100;
        return true;
    }
}