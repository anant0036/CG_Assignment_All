import java.util.HashSet;
import java.util.Set;

class Employee
{
    private String name;
    private int id;

    public Employee(String name,int id)
    {
        super();
        this.name = name;
        this.id = id;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setMonth(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {
        Employee that = (Employee) obj;
        boolean isEqual = this.id == that.id && this.name.equals(that.name);
        return isEqual;
    }

    @Override
    public int hashCode()
    {
        return id + name.hashCode();
    }

}

public class Assignment3Q5
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Joe",1);
        Employee emp2 = new Employee("Joe",1);

        System.out.println(emp1.equals(emp2));

        Set<Employee> ep = new HashSet<>();
        ep.add(emp1);
        ep.add(emp2);

        System.out.println(ep);

    }
}

