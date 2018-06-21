public class CustomerTester
{
    public static void main(String[] args)
    {
        Customer test1 = new Customer();
        test1.makePurchase(100.00);
        System.out.println("The customers total after discount is " + test1.afterDiscountCheck());

        test1.makePurchase(95.00);
        System.out.println("The customers total after discount is " + test1.afterDiscountCheck());

        test1.makePurchase(50.00);
        System.out.println("The customers total after discount is " + test1.afterDiscountCheck());
        
        test1.makePurchase(50.00);
        System.out.println("The customers total after discount is " + test1.afterDiscountCheck());
    }
}