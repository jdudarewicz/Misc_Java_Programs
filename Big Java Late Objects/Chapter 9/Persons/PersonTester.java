public class PersonTester
{
    public static void main(String[] args)
    {
        Instructor test = new Instructor("testInstructor","1980","100000");
        System.out.println(test.toString());

        Student test1 = new Student("testStudent", "1999", "Computer Science");
        System.out.println(test1.toString());

        Employee test2 = new Employee("testEmployee", "1980", "65000");
        System.out.println(test2.toString());

        Manager test3 = new Manager("testManager", "1985", "80000", "Quality Assurance");
        System.out.println(test3.toString());

        Manager test4 = new Executive("CEO", "1970", "250000", "Chief Operations");
        System.out.println(test4.toString());
    }
}