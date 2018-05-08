public class MothMover
{
    public static void main(String[] args)
    {
        Moth moth = new Moth(10.0);

        moth.moveToLight(10.0);
        moth.getPosition();
        moth.moveToLight(20.0);
        moth.getPosition();
        moth.moveToLight(40.0);
        moth.getPosition();
    }
}