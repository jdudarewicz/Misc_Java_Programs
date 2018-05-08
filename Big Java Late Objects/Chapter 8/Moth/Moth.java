public class Moth
{
    private double mothDistance;

    public Moth(double inital)
    {
        mothDistance = inital;
    }

    public void moveToLight(double lightPosition)
    {
        mothDistance = ((lightPosition - mothDistance) / 2) + mothDistance;
    }

    public void getPosition()
    {
        System.out.println("Moth's position: " + mothDistance);
    }
}