import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter in your final grade (no decimals):");
            int FinalGrade = in.nextInt();

            if (FinalGrade < 50)
            {
                System.out.print("You failed :(");
            }
            else if (FinalGrade < 60)
            {
                System.out.print("Your grade was a D!");
            }
            else if (FinalGrade < 70)
            {
                System.out.print("Your grade was a C!");
            }
            else if (FinalGrade < 80)
            {
                System.out.print("Your grade was a B!");
            }
            else if (FinalGrade < 100)
            {
                System.out.print("Your grade was an A!");
            }
            else if (FinalGrade > 100 || FinalGrade < 0)
            {
                System.out.print("Invalid input");
            }
    }
}