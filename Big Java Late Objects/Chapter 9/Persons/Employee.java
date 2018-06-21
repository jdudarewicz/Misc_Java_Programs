public class Employee extends Person
{
    private String salary;

    public Employee(String name, String birthYear, String salary)
    {
        super(name, birthYear);
        this.salary = salary;
    }

    public String toString()
    {
        return super.toString() + ", Salary: " + salary;
    }
}