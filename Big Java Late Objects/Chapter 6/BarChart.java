import java.util.*;

public class BarChart
{
    public static void main(String[] args)
    {
        ArrayList<Double> barValues = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the values you would like to represent as a bar chart: ");

        double max = 0;
        while(in.hasNextDouble())
            {
                double input = in.nextDouble();
                barValues.add(input);
                if(max < input)
                    {
                        max = input;
                    }
            }
        
        for(int i = 0; i < barValues.size(); i++)
            {
                double proportionality = barValues.get(i)/max;
                int toPrint = (int)(40.0 * proportionality);
                for(int j = 0; j < toPrint; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}