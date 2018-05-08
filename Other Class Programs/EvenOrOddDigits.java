import java.util.Scanner;

public class EvenOrOddDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 2 Digits, to determine whether each is even or odd: ");
        int digitInput = in.nextInt();
        
        int tensDigit = (digitInput/10) % 2;
        int onesDigit = digitInput % 2;
        String EvenOrOdd = "";

        if (tensDigit == 0 && onesDigit == 0)
        {
            EvenOrOdd = "00";
        }
        else if (tensDigit == 1 && onesDigit == 1)
        {
            EvenOrOdd = "11";
        }
        else if (tensDigit == 0 && onesDigit == 1)
        {
            EvenOrOdd = "01";
        }
        else if (tensDigit == 1 && onesDigit == 0)
        {
            EvenOrOdd = "10";
        }

        System.out.println(EvenOrOdd);
    }
}