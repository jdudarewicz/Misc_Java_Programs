public class Country
{
    private String name;
    private double population;
    private double area;

    public Country(String name, double population, double area)
    {
        this.name = name; this.population = population; this.area = area;
    }

    public String getName()
    {
        return name;
    }

    public double getPopulaton()
    {
        return population;
    }

    public double getArea()
    {
        return area;
    }

    public double getDensity()
    {
        double density = population/area;
        return density;
    }
}