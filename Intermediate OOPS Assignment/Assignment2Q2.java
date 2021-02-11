import java.util.ArrayList;

class Manager extends Assignment2Q2 
{
    @Override
    public int getSalary(int salary) 
    {
        int incentive =salary+5000;
        return incentive;
    }
}

class Labour extends Assignment2Q2 
{
    @Override
    public int getSalary(int salary)
    {
        int overtime = salary+500;
        return overtime;
    }
}


public class Assignment2Q2 
{
    int salary = 10000;
    
    public int getSalary(int salary)
    {
        int finalpay = salary;
        return finalpay;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
        int ca=0;
        System.out.println("--------------");
        for(int employeeSalarie : employeeSalaries)
        {
            ca = ca+employeeSalarie;
        }
        return ca;
    }
    public static void main(String[] args) 
    {
        int salary = 10000;
        Manager mana = new Manager();
        int manasala = mana.getSalary(salary);

        Labour lab = new Labour();
        int labsala = lab.getSalary(salary);


        ArrayList <Integer> employeeSalaries = new ArrayList<>();
        employeeSalaries.add(manasala);
        employeeSalaries.add(labsala);

        Assignment2Q2 lastclass = new Assignment2Q2 ();
        lastclass.totalEmployeesSalary(employeeSalaries);
    }
}

