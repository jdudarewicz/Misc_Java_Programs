public class Manager extends Employee
{
    private String department;

    public Manager(String name, String birthYear, String salary, String department)
    {
        super(name, birthYear, salary);
        this.department = department;
    }

    public String toString()
    {
        return super.toString() + ", Department: " + department;
    }
}