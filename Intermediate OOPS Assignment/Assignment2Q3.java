import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash()
    {
        return totalDeposits;
    }
}
class SavingsAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash()
    {
        return totalDeposits;
    }
}
public class Assignment2Q3 
{
    int totalDeposits;
    public int totalCashInBank(ArrayList<Integer> cash)
    {
        int totalcash = 0;
        System.out.println("Total cash");
        for(int totalCash : cash)
        {
            totalcash = totalcash+totalCash;
        }
        System.out.println(totalcash);
        return totalcash;
    }
    public int getCash()
    {
        return totalDeposits;
    }
    public static void main(String[] args) 
    {
        CurrentAccount CA = new CurrentAccount();
        int first = CA.getCash();

        SavingsAccount SA = new SavingsAccount();
        int second = SA.getCash();

        ArrayList<Integer> cash = new ArrayList<>();
        cash.add(first);
        cash.add(second);

        Assignment2Q3 doit = new Assignment2Q3();
        doit.totalCashInBank(cash);

    }
}

