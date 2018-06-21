public class CountryTester
{
    public static void main(String[] args)
    {    
        Country[] countries = {
            new Country("China", 1388650000.0, 9597000000.0), 
            new Country("India", 1326550000.0, 3287000000.0), 
            new Country("United States", 326451000.0, 9834000000.0), 
            new Country("Germany", 82800000.0, 357376.0), 
            new Country("Canada", 36987400.0, 9985000000.0) 
        };

        Measurable largestArea =  maximum(countries);

        System.out.println(largestArea.toString());
    }

    public static Measurable maximum(Measurable[] objects)
    {
        Measurable largest = objects[0];

        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i].getMeasure() > largest.getMeasure())
            {largest = objects[i];}
        }

        return largest;
    }
}