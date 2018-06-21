public class Student extends Person
{
    private String major;

    public Student(String name, String birthYear, String major)
    {
        super(name, birthYear);
        this.major = major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String toString()
    {
        return super.toString() + ", Major: " + major;
    }
}