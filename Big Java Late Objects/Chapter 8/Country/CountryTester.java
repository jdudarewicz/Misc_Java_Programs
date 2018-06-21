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

        double maxPop = 0;
        int maxPopIndex = 0;
        double maxArea = 0;
        int maxAreaIndex = 0;
        double maxDensity = 0;
        int maxDensityIndex = 0;

        for(int i = 0; i < countries.length; i++)
        {
            if(countries[i].getPopulaton() > maxPop)
            {
                maxPop = countries[i].getPopulaton();
                maxPopIndex = i;
            }
            if(countries[i].getArea() > maxArea)
            {
                maxArea = countries[i].getArea();
                maxAreaIndex = i;
            }
            if(countries[i].getDensity() > maxDensity)
            {
                maxDensity = countries[i].getDensity();
                maxDensityIndex = i;
            }
        }

        System.out.println("The country with the max population is " + countries[maxPopIndex].getName() + ", with a population of " + maxPop);
        System.out.println("The country with the max area is " + countries[maxAreaIndex].getName() + ", with a population of " + maxArea);
        System.out.println("The country with the max density is " + countries[maxDensityIndex].getName() + ", with a population of " + maxDensity);
    }
}