public class Instructor extends Person
{
    private String salary;

    public Instructor(String name, String birthYear, String salary)
    {
        super(name, birthYear);
        this.salary = salary;
    }
    public void setSalary(String salary)
    {
        this.salary = salary;
    }

    public String toString()
    {
        return super.toString() + ", salary: " + salary;
    }
}